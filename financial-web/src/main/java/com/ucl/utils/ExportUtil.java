package com.ucl.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.util.Assert;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.List;

/**
 * Created by jiang.zheng on 2017/9/20.
 */
public class ExportUtil {

    private static final Logger logger = LogManager.getLogger(ExportUtil.class);

    public static void writeToResponse(HttpServletResponse response, File file, String fileName) {
        try (OutputStream os = response.getOutputStream();
            FileInputStream in = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(in))
        {
           /* response.setContentType("application/x-download");
            response.addHeader("Content-Disposition", "attachment:filename=" + fileName + ".csv");*/

            response.setContentType("application/force-download");// 设置强制下载不打开
            response.addHeader("Content-Disposition", "attachment;fileName=" + fileName + ".csv");// 设置文件名
            byte bufferByte[] = new byte[1024];
            int read = 0;
            while ((read = bis.read(bufferByte)) != -1) {
                os.write(bufferByte, 0, read);
            }
            file.delete();
            os.close();
            in.close();
            bis.close();
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
    }

    /**
     *
     * @param header
     * @param fileName
     * @return
     */
    public static File writeHeader(String[] header, String fileName) {
      String tmpPath = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
              .getRequest()
              .getSession()
              .getServletContext()
              .getRealPath("/excel");
        return writeHeader(header, fileName, tmpPath);
    }

    /**
     * 写入文件头
     * @param map
     * @param fileName
     * @param tmpPath
     * @return
     */
    public static File writeHeader(String[] header, String fileName, String tmpPath) {
        File file = null;
        BufferedWriter bw = null;
        try {
            file = new File(tmpPath);
            if (!file.exists()) {
                file.mkdir();
            }
            file = File.createTempFile(fileName, ".csv", new File(tmpPath));
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true),"GBK"),1024);
            for (String head: header) {
                bw.write(new String(head.getBytes("GBK"), "GBK"));
                bw.write(",");
            }
            bw.write("\r\n");
            bw.flush();
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                logger.error(e.getMessage(), e);
            }
        }
        return file;
    }

    /**
     * 写入数据
     * @param file
     * @param list
     * @param fields
     * @return
     */
    public static File writeData(File file, List list, String[] fields) {
        try (BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(file, true),"GBK"),1024)) {
            Object object = null;
            Class clazz = null;
            String fieldName = null;
            Field field = null;
            for (int j=0; list != null && !list.isEmpty() && j<list.size(); j++) {
                object = list.get(j);
                clazz = object.getClass();
                for (int i=0; fields!=null && i<fields.length; i++) {
                    fieldName = toUpperCaseFirstOne(fields[i]);
                    field = getAccessibleField(object, fields[i]);
                    Method method = null;
                    try {
                        method = clazz.getMethod(fieldName);
                    } catch (Exception e) {
                        continue;
                    }
                    method.setAccessible(true);
                    Object o = method.invoke(object);
                    String content = String.valueOf(o);
                    if (null == content || content.equals("null")) {
                        content = "";
                    } else if (field.getType() == Date.class) {
                        if ("null".equals(content)) {
                            content = "";
                        } else {
                            content = DateUtil.dateTimeFormat((Date) o) + "\t";
                        }
                    } else if (field.getType() == String.class) {
                        content = "\"" + content + "\"";
                    }
                    bw.write(content);
                    bw.write(",");
                }
                bw.write("\r\n");
            }
            bw.flush();
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return file;
    }

    /**
     * 写入数据
     * @param bw
     * @param list
     * @param fields
     * @return
     */
    public static BufferedWriter writeData(BufferedWriter bw, List list, String[] fields) {
        try {
            Object object = null;
            Class clazz = null;
            String fieldName = null;
            Field field = null;
            for (int j=0; list != null && !list.isEmpty() && j<list.size(); j++) {
                object = list.get(j);
                clazz = object.getClass();
                for (int i=0; fields!=null && i<fields.length; i++) {
                    fieldName = toUpperCaseFirstOne(fields[i]);
                    field = getAccessibleField(object, fields[i]);
                    Method method = null;
                    try {
                        method = clazz.getMethod(fieldName);
                    } catch (Exception e) {
                        continue;
                    }
                    method.setAccessible(true);
                    Object o = method.invoke(object);
                    String content = String.valueOf(o);
                    if (null == content || content.equals("null")) {
                        content = "";
                    } else if (field.getType() == Date.class) {
                        if ("null".equals(content)) {
                            content = "";
                        } else {
                            content = DateUtil.dateTimeFormat((Date) o) + "\t";
                        }
                    } else if (field.getType() == String.class) {
                        content = "\"" + content + "\"";
                    }
                    bw.write(content);
                    bw.write(",");
                }
                bw.write("\r\n");
            }
            bw.flush();
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return bw;
    }

    /**
     * 合成get方法名
     * @param origin
     * @return
     */
    private static String toUpperCaseFirstOne(String origin) {
        StringBuffer sb = new StringBuffer();
        sb.append(origin);
        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        sb.insert(0, "get");
        return sb.toString();
    }

    /**
     * 循环向上转型，获取对象的DeclareField，并强制设置为可访问
     * @param object
     * @param fieldName
     * @return
     */
    private static Field getAccessibleField(final Object object, final String fieldName) {
        Assert.notNull(object, "object不能为空");
        Assert.hasText(fieldName, "fieldName");
        for (Class<?> superClass = object.getClass(); superClass != Object.class; superClass = superClass.getSuperclass()) {
            try {
                Field field = superClass.getDeclaredField(fieldName);
                field.setAccessible(true);
                return field;
            } catch (NoSuchFieldException e) {
                logger.error(e.getMessage(), e);
            }
        }
        return null;
    }
}

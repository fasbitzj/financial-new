package com.ucl.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jiang.zheng on 2017/9/18.
 */
public class ObjectUtil {

    private static final Logger logger = LogManager.getLogger(ObjectUtil.class);

    public static Map<String, Object> objectToMap(Object object) {
        Map<String, Object> resultMap = new HashMap<>();
        if (null == object) return resultMap;

        Class<? extends Object> type = object.getClass();
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(type);
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (int i=0; i<propertyDescriptors.length; i++) {
                PropertyDescriptor descriptor = propertyDescriptors[i];
                String propertyName = descriptor.getName();
                if (!propertyName.equals("class")) {
                    Method method = descriptor.getReadMethod();
                    Object result = method.invoke(object, new Object[0]);
                    if (null != result) {
                        resultMap.put(propertyName, result);
                    }
                }
            }
        } catch (Exception e) {
            logger.error("转化为Map失败", e);
        }
        return resultMap;
    }
}

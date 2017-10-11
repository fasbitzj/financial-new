package com.ucl.utils;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * Created by jiang.zheng on 2017/9/20.
 */
public class DateUtil {

    private static final DateTimeFormatter DEFAULT_PATTERN = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    /**
     * dateTimeFormat
     * @param dateTime
     * @return
     */
    public static String dateTimeFormat(Date dateTime) {
        LocalDateTime localDateTime = LocalDateTime.ofInstant(dateTime.toInstant(), ZoneId.systemDefault());
        return localDateTime.format(DEFAULT_PATTERN);
    }

    /**
     * 转为Date
     * @param dateTime
     * @return
     */
    public static Date conventToDateTime(String dateTime) {
        LocalDateTime localDateTime = LocalDateTime.parse(dateTime, DEFAULT_PATTERN);
        Date out = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        return out;
    }
}

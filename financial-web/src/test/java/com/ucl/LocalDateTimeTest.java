package com.ucl;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * Created by jiang.zheng on 2017/9/19.
 */
public class LocalDateTimeTest {

    public static void main(String[] args) {
        String dateTime = "2017-09-01 10:00:00";
        LocalDateTime localDateTime = LocalDateTime.parse(dateTime, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        Date out = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        System.out.println(out);
    }
}

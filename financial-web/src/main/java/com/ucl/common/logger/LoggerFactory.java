package com.ucl.common.logger;

import com.ucl.common.logger.log4j2.Log4j2LoggerAdapter;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * 日志工厂
 * Created by jiang.zheng on 2017/10/9.
 */
public class LoggerFactory {

    private static LoggerAdapter loggerAdapter = new Log4j2LoggerAdapter();

    private static final ConcurrentMap<String, Logger> LOGGERS = new ConcurrentHashMap<>();

    /**
     * 获取日志
     * @param key
     * @return
     */
    public static Logger getLogger(Class<?> key) {
        Logger logger = LOGGERS.get(key);
        if (null == logger) {
            LOGGERS.putIfAbsent(key.getName(), loggerAdapter.getLogger(key));
            logger = LOGGERS.get(key.getName());
        }
        return logger;
    }

    /**
     * 获取日志
     * @param key
     * @return
     */
    public static Logger getLogger(String key) {
        Logger logger = LOGGERS.get(key);
        if (null == logger) {
            LOGGERS.putIfAbsent(key, loggerAdapter.getLogger(key));
            logger = LOGGERS.get(key);
        }
        return logger;
    }
}

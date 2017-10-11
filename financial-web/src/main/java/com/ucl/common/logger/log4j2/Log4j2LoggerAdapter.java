package com.ucl.common.logger.log4j2;

import com.ucl.common.logger.Logger;
import com.ucl.common.logger.LoggerAdapter;

/**
 * Created by jiang.zheng on 2017/10/9.
 */
public class Log4j2LoggerAdapter implements LoggerAdapter {
    @Override
    public Logger getLogger(Class<?> key) {
        return new Log4j2Logger(key);
    }

    @Override
    public Logger getLogger(String key) {
        return new Log4j2Logger(key);
    }
}

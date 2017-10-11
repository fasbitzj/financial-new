package com.ucl.common.logger.log4j2;

import com.ucl.common.logger.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.ThreadContext;

/**
 * Created by jiang.zheng on 2017/10/9.
 */
public class Log4j2Logger implements Logger {

    private final org.apache.logging.log4j.Logger logger;

    public Log4j2Logger(Class<?> key) {
        this.logger = LogManager.getLogger(key);
    }

    public Log4j2Logger(String key) {
        this.logger = LogManager.getLogger(key);
    }

    private void addRealClass() {
        try{
            StackTraceElement[] stack = Thread.currentThread().getStackTrace();
            ThreadContext.put("RealClass", String.valueOf(stack[3]));
        } catch (Exception e) {

        }
    }

    @Override
    public void debug(Object message) {
        try {
            if (isDebugEnabled()) {
                addRealClass();
                logger.debug(message);
            }
        } catch (Exception e) {

        }
    }

    @Override
    public void debug(Object message, Throwable t) {
        try {
            if (isDebugEnabled()) {
                addRealClass();
                logger.debug(message, t);
            }
        } catch (Exception e) {

        }
    }

    @Override
    public void debug(String message) {
        try {
            if (isDebugEnabled()) {
                addRealClass();
                logger.debug(message);
            }
        } catch (Exception e) {

        }
    }

    @Override
    public void debug(String message, Object... params) {
        try {
            if (isDebugEnabled()) {
                addRealClass();
                logger.debug(message, params);
            }
        } catch (Exception e) {

        }
    }

    @Override
    public void debug(String message, Throwable t) {
        try {
            if (isDebugEnabled()) {
                addRealClass();
                logger.debug(message, t);
            }
        } catch (Exception e) {

        }
    }

    @Override
    public void info(Object message) {
        try {
            if (isInfoEnabled()) {
                addRealClass();
                logger.info(message);
            }
        } catch (Exception e) {

        }
    }

    @Override
    public void info(Object message, Throwable t) {
        try {
            if (isInfoEnabled()) {
                addRealClass();
                logger.info(message, t);
            }
        } catch (Exception e) {

        }
    }

    @Override
    public void info(String message) {
        try {
            if (isInfoEnabled()) {
                addRealClass();
                logger.info(message);
            }
        } catch (Exception e) {

        }
    }

    @Override
    public void info(String message, Object... params) {
        try {
            if (isInfoEnabled()) {
                addRealClass();
                logger.info(message, params);
            }
        } catch (Exception e) {

        }
    }

    @Override
    public void info(String message, Throwable t) {
        try {
            if (isInfoEnabled()) {
                addRealClass();
                logger.info(message, t);
            }
        } catch (Exception e) {

        }
    }

    @Override
    public void warn(Object message) {
        try {
            if (isWarnEnabled()) {
                addRealClass();
                logger.warn(message);
            }
        } catch (Exception e) {

        }
    }

    @Override
    public void warn(Object message, Throwable t) {
        try {
            if (isWarnEnabled()) {
                addRealClass();
                logger.warn(message, t);
            }
        } catch (Exception e) {

        }
    }

    @Override
    public void warn(String message) {
        try {
            if (isWarnEnabled()) {
                addRealClass();
                logger.warn(message);
            }
        } catch (Exception e) {

        }
    }

    @Override
    public void warn(String message, Object... params) {
        try {
            if (isWarnEnabled()) {
                addRealClass();
                logger.warn(message, params);
            }
        } catch (Exception e) {

        }
    }

    @Override
    public void warn(String message, Throwable t) {
        try {
            if (isWarnEnabled()) {
                addRealClass();
                logger.warn(message, t);
            }
        } catch (Exception e) {

        }
    }

    @Override
    public void error(Object message) {
        try {
            if (isErrorEnabled()) {
                addRealClass();
                logger.error(message);
            }
        } catch (Exception e) {

        }
    }

    @Override
    public void error(Object message, Throwable t) {
        try {
            if (isErrorEnabled()) {
                addRealClass();
                logger.error(message, t);
            }
        } catch (Exception e) {

        }
    }

    @Override
    public void error(String message) {
        try {
            if (isErrorEnabled()) {
                addRealClass();
                logger.error(message);
            }
        } catch (Exception e) {

        }
    }

    @Override
    public void error(String message, Object... params) {
        try {
            if (isErrorEnabled()) {
                addRealClass();
                logger.error(message, params);
            }
        } catch (Exception e) {

        }
    }

    @Override
    public void error(String message, Throwable t) {
        try {
            if (isErrorEnabled()) {
                addRealClass();
                logger.error(message, t);
            }
        } catch (Exception e) {

        }
    }

    @Override
    public void fatal(Object message) {
        try {
            if (isFatalEnabled()) {
                addRealClass();
                logger.fatal(message);
            }
        } catch (Exception e) {

        }
    }

    @Override
    public void fatal(Object message, Throwable t) {
        try {
            if (isFatalEnabled()) {
                addRealClass();
                logger.fatal(message, t);
            }
        } catch (Exception e) {

        }
    }

    @Override
    public void fatal(String message) {
        try {
            if (isFatalEnabled()) {
                addRealClass();
                logger.fatal(message);
            }
        } catch (Exception e) {

        }
    }

    @Override
    public void fatal(String message, Object... params) {
        try {
            if (isFatalEnabled()) {
                addRealClass();
                logger.fatal(message, params);
            }
        } catch (Exception e) {

        }
    }

    @Override
    public void fatal(String message, Throwable t) {
        try {
            if (isFatalEnabled()) {
                addRealClass();
                logger.fatal(message, t);
            }
        } catch (Exception e) {

        }
    }

    @Override
    public void trace(Object message) {
        try {
            if (isTraceEnabled()) {
                addRealClass();
                logger.trace(message);
            }
        } catch (Exception e) {

        }
    }

    @Override
    public void trace(Object message, Throwable t) {
        try {
            if (isTraceEnabled()) {
                addRealClass();
                logger.trace(message, t);
            }
        } catch (Exception e) {

        }
    }

    @Override
    public void trace(String message) {
        try {
            if (isTraceEnabled()) {
                addRealClass();
                logger.trace(message);
            }
        } catch (Exception e) {

        }
    }

    @Override
    public void trace(String message, Object... params) {
        try {
            if (isTraceEnabled()) {
                addRealClass();
                logger.trace(message, params);
            }
        } catch (Exception e) {

        }
    }

    @Override
    public void trace(String message, Throwable t) {
        try {
            if (isTraceEnabled()) {
                addRealClass();
                logger.trace(message, t);
            }
        } catch (Exception e) {

        }
    }

    @Override
    public boolean isDebugEnabled() {
        return logger.isDebugEnabled();
    }

    @Override
    public boolean isInfoEnabled() {
        return logger.isInfoEnabled();
    }

    @Override
    public boolean isWarnEnabled() {
        return logger.isWarnEnabled();
    }

    @Override
    public boolean isErrorEnabled() {
        return logger.isErrorEnabled();
    }

    @Override
    public boolean isTraceEnabled() {
        return logger.isTraceEnabled();
    }

    @Override
    public boolean isFatalEnabled() {
        return logger.isFatalEnabled();
    }
}

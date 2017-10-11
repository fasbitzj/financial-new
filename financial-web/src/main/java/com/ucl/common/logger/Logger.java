package com.ucl.common.logger;

import org.apache.logging.log4j.Level;

/**
 * 日志接口
 * Created by jiang.zheng on 2017/10/9.
 */
public interface Logger {

//    debug
    /**
     * Logs a message object with the {@link Level#DEBUG DEBUG} level.
     *
     * @param message the message object to log.
     */
    void debug(Object message);

    /**
     * Logs a message at the {@link Level#DEBUG DEBUG} level including the stack trace of the {@link Throwable}
     * <code>t</code> passed as parameter.
     *
     * @param message the message to log.
     * @param t the exception to log, including its stack trace.
     */
    void debug(Object message, Throwable t);

    /**
     * Logs a message object with the {@link Level#DEBUG DEBUG} level.
     *
     * @param message the message string to log.
     */
    void debug(String message);

    /**
     * Logs a message with parameters at the {@link Level#DEBUG DEBUG} level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param params parameters to the message.
     * @see #getMessageFactory()
     */
    void debug(String message, Object... params);

    /**
     * Logs a message at the {@link Level#DEBUG DEBUG} level including the stack trace of the {@link Throwable}
     * <code>t</code> passed as parameter.
     *
     * @param message the message to log.
     * @param t the exception to log, including its stack trace.
     */
    void debug(String message, Throwable t);

//    info

    /**
     * Logs a message object with the {@link Level#INFO INFO} level.
     *
     * @param message the message object to log.
     */
    void info(Object message);

    /**
     * Logs a message at the {@link Level#INFO INFO} level including the stack trace of the {@link Throwable}
     * <code>t</code> passed as parameter.
     *
     * @param message the message object to log.
     * @param t the exception to log, including its stack trace.
     */
    void info(Object message, Throwable t);

    /**
     * Logs a message object with the {@link Level#INFO INFO} level.
     *
     * @param message the message string to log.
     */
    void info(String message);

    /**
     * Logs a message with parameters at the {@link Level#INFO INFO} level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param params parameters to the message.
     * @see #getMessageFactory()
     */
    void info(String message, Object... params);

    /**
     * Logs a message at the {@link Level#INFO INFO} level including the stack trace of the {@link Throwable}
     * <code>t</code> passed as parameter.
     *
     * @param message the message object to log.
     * @param t the exception to log, including its stack trace.
     */
    void info(String message, Throwable t);

//    warn
    /**
     * Logs a message object with the {@link Level#WARN WARN} level.
     *
     * @param message the message object to log.
     */
    void warn(Object message);

    /**
     * Logs a message at the {@link Level#WARN WARN} level including the stack trace of the {@link Throwable}
     * <code>t</code> passed as parameter.
     *
     * @param message the message object to log.
     * @param t the exception to log, including its stack trace.
     */
    void warn(Object message, Throwable t);

    /**
     * Logs a message object with the {@link Level#WARN WARN} level.
     *
     * @param message the message string to log.
     */
    void warn(String message);

    /**
     * Logs a message with parameters at the {@link Level#WARN WARN} level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param params parameters to the message.
     * @see #getMessageFactory()
     */
    void warn(String message, Object... params);

    /**
     * Logs a message at the {@link Level#WARN WARN} level including the stack trace of the {@link Throwable}
     * <code>t</code> passed as parameter.
     *
     * @param message the message object to log.
     * @param t the exception to log, including its stack trace.
     */
    void warn(String message, Throwable t);

//    Error
    /**
     * Logs a message object with the {@link Level#ERROR ERROR} level.
     *
     * @param message the message object to log.
     */
    void error(Object message);

    /**
     * Logs a message at the {@link Level#ERROR ERROR} level including the stack trace of the {@link Throwable}
     * <code>t</code> passed as parameter.
     *
     * @param message the message object to log.
     * @param t the exception to log, including its stack trace.
     */
    void error(Object message, Throwable t);

    /**
     * Logs a message object with the {@link Level#ERROR ERROR} level.
     *
     * @param message the message string to log.
     */
    void error(String message);

    /**
     * Logs a message with parameters at the {@link Level#ERROR ERROR} level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param params parameters to the message.
     * @see #getMessageFactory()
     */
    void error(String message, Object... params);

    /**
     * Logs a message at the {@link Level#ERROR ERROR} level including the stack trace of the {@link Throwable}
     * <code>t</code> passed as parameter.
     *
     * @param message the message object to log.
     * @param t the exception to log, including its stack trace.
     */
    void error(String message, Throwable t);

// fatal
    /**
     * Logs a message object with the {@link Level#FATAL FATAL} level.
     *
     * @param message the message object to log.
     */
    void fatal(Object message);

    /**
     * Logs a message at the {@link Level#FATAL FATAL} level including the stack trace of the {@link Throwable}
     * <code>t</code> passed as parameter.
     *
     * @param message the message object to log.
     * @param t the exception to log, including its stack trace.
     */
    void fatal(Object message, Throwable t);

    /**
     * Logs a message object with the {@link Level#FATAL FATAL} level.
     *
     * @param message the message string to log.
     */
    void fatal(String message);

    /**
     * Logs a message with parameters at the {@link Level#FATAL FATAL} level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param params parameters to the message.
     * @see #getMessageFactory()
     */
    void fatal(String message, Object... params);

    /**
     * Logs a message at the {@link Level#FATAL FATAL} level including the stack trace of the {@link Throwable}
     * <code>t</code> passed as parameter.
     *
     * @param message the message object to log.
     * @param t the exception to log, including its stack trace.
     */
    void fatal(String message, Throwable t);

//  trace

    /**
     * Logs a message object with the {@link Level#TRACE TRACE} level.
     *
     * @param message the message object to log.
     */
    void trace(Object message);

    /**
     * Logs a message at the {@link Level#TRACE TRACE} level including the stack trace of the {@link Throwable}
     * <code>t</code> passed as parameter.
     *
     * @param message the message object to log.
     * @param t the exception to log, including its stack trace.
     * @see #debug(String)
     */
    void trace(Object message, Throwable t);

    /**
     * Logs a message object with the {@link Level#TRACE TRACE} level.
     *
     * @param message the message string to log.
     */
    void trace(String message);

    /**
     * Logs a message with parameters at the {@link Level#TRACE TRACE} level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param params parameters to the message.
     * @see #getMessageFactory()
     */
    void trace(String message, Object... params);

    /**
     * Logs a message at the {@link Level#TRACE TRACE} level including the stack trace of the {@link Throwable}
     * <code>t</code> passed as parameter.
     *
     * @param message the message object to log.
     * @param t the exception to log, including its stack trace.
     * @see #debug(String)
     */
    void trace(String message, Throwable t);

//  isEnable

    /**
     * Checks whether this Logger is enabled for the {@link Level#DEBUG DEBUG} Level.
     *
     * @return boolean - {@code true} if this Logger is enabled for level DEBUG, {@code false} otherwise.
     */
    boolean isDebugEnabled();

    /**
     * Checks whether this Logger is enabled for the {@link Level#INFO INFO} Level.
     *
     * @return boolean - {@code true} if this Logger is enabled for level INFO, {@code false} otherwise.
     */
    boolean isInfoEnabled();

    /**
     * Checks whether this Logger is enabled for the {@link Level#WARN WARN} Level.
     *
     * @return boolean - {@code true} if this Logger is enabled for level {@link Level#WARN WARN}, {@code false}
     *         otherwise.
     */
    boolean isWarnEnabled();

    /**
     * Checks whether this Logger is enabled for the {@link Level#ERROR ERROR} Level.
     *
     * @return boolean - {@code true} if this Logger is enabled for level {@link Level#ERROR ERROR}, {@code false}
     *         otherwise.
     */
    boolean isErrorEnabled();

    /**
     * Checks whether this Logger is enabled for the {@link Level#TRACE TRACE} level.
     *
     * @return boolean - {@code true} if this Logger is enabled for level TRACE, {@code false} otherwise.
     */
    boolean isTraceEnabled();

    /**
     * Checks whether this Logger is enabled for the {@link Level#FATAL FATAL} Level.
     *
     * @return boolean - {@code true} if this Logger is enabled for level {@link Level#FATAL FATAL}, {@code false}
     *         otherwise.
     */
    boolean isFatalEnabled();
}

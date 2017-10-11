package com.ucl.common.logger;

/**
 * 日志适配接口
 * Created by jiang.zheng on 2017/10/9.
 */
public interface LoggerAdapter {

    /**
     * 获取日志输出器
     * @param key 分类键
     * @return 日志输出器，后验条件：不返回null
     */
    Logger getLogger(Class<?> key);

    /**
     * 获取日志输出器
     * @param key 分类键
     * @return 日志输出器，后验条件：不返回null
     */
    Logger getLogger(String key);
}

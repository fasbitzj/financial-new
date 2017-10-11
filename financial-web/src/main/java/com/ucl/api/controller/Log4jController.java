package com.ucl.api.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jiang.zheng on 2017/9/20.
 */
@RestController
@RequestMapping(value = "/api")
public class Log4jController {

    private static final Logger logger = Logger.getLogger(Log4jController.class);

    @RequestMapping(value = "log4j")
    public Object loggerTest() {
        logger.debug("logger debug");
        logger.info("logger info");
        logger.warn("logger warn");
        logger.error("logger error");
        return "ok";
    }
}

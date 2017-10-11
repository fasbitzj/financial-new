package com.ucl.api.controller;

import com.ucl.common.logger.Logger;
import com.ucl.common.logger.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jiang.zheng on 2017/9/5.
 */
@RequestMapping(value = "/api")
@RestController
public class ApiController {

//    private static final Logger logger = LogManager.getLogger(ApiController.class);
    private static final Logger logger = LoggerFactory.getLogger(ApiController.class);

    @RequestMapping(value = "test")
    public Object test() {
        logger.debug("test ok");
        return "ok";
    }

    @RequestMapping(value = "logger")
    public Object logger(Integer times) {
        if (null != times) {
//            for (int j=0; j<times; j++) {
                loggerTest(times);
//            }
        } else {
            loggerTest(times);
        }
        return "log test start";
    }

    private void loggerTest(Integer times) {
        if (null == times) times = 1;
        for (int i=0; i<times; i++) {
            logger.debug("log debug test");
            logger.info("log info test");
            logger.warn("log warn test");
            logger.error("log error test");
            logger.info(i);
        }
    }
}

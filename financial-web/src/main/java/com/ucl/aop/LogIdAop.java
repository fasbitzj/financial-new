package com.ucl.aop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by zj on 9/20/17.
 */
@Component
@Aspect
public class LogIdAop {

    private static final Logger logger = LogManager.getLogger(LogIdAop.class);

    @Pointcut("execution(* com.ucl..*.*(..))")
    public void executeService(){

    }

    @Before("executeService()")
    public void doBefore(JoinPoint joinPoint) {
        ThreadContext.put("logId", String.valueOf(System.currentTimeMillis()));
        logger.info(joinPoint);
    }

    @After("executeService()")
    public void doAfter(JoinPoint joinPoint) {
        logger.info(joinPoint);
        ThreadContext.clearAll();
    }
}

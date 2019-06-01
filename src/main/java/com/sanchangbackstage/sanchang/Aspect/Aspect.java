package com.sanchangbackstage.sanchang.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@org.aspectj.lang.annotation.Aspect
@Component
public class Aspect {
    private final static Logger logger = LoggerFactory.getLogger(Aspect.class);
    @Pointcut("execution(public * com.sanchangbackstage.sanchang.controller.BackendPageController.*(..))")
    public void point(){

    }

    @Before("point()")
    public void test(JoinPoint joinPoint){
        logger.info("111111111111111111111111");
        ServletRequestAttributes attributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = null;
        if(attributes!=null){
            request = attributes.getRequest();
            logger.info("url={}",request.getRequestURI());
            logger.info("method={}",request.getMethod());
            logger.info("ip={}",request.getRemoteAddr());
            logger.info("class_method={}",joinPoint.getSignature().getDeclaringTypeName());
            logger.info("参数={}",joinPoint.getArgs());
        }
    }
//    @After("point()")
//    public void ssss(){
//        logger.info("2222222222222222222222");
//
//
//    }

}

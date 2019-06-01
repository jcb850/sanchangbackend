package com.sanchangbackstage.sanchang.handle;

import com.sanchangbackstage.sanchang.Aspect.Aspect;
import com.sanchangbackstage.sanchang.StatusMessage.StatusMessage;
import com.sanchangbackstage.sanchang.StatusMessage.resultEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExecptionHandle {
    private final static Logger logger = LoggerFactory.getLogger(Aspect.class);

    @ExceptionHandler(value = IllegalArgumentException.class)
    @ResponseBody
    public StatusMessage Argumenthandle(Exception e){
        logger.error("参数错误："+e.toString());
        return new StatusMessage(resultEnum.error_outside.getCode(),resultEnum.error_outside.getMessage());
    }
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public StatusMessage handle(Exception e){
        logger.error("内部错误："+e.toString());
        return new StatusMessage(resultEnum.error_inside.getCode(),resultEnum.error_inside.getMessage());
    }


}

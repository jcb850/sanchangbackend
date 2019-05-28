package com.sanchangbackstage.sanchang.handle;

import com.sanchangbackstage.sanchang.StatusMessage.StatusMessage;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExecptionHandle {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public StatusMessage handle(Exception e){
        return new StatusMessage(e.toString());
    }

}

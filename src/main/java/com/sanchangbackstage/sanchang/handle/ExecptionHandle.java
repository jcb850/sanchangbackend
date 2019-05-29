package com.sanchangbackstage.sanchang.handle;

import com.sanchangbackstage.sanchang.StatusMessage.StatusMessage;
import com.sanchangbackstage.sanchang.StatusMessage.resultEnum;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExecptionHandle {


    @ExceptionHandler(value = IllegalArgumentException.class)
    @ResponseBody
    public StatusMessage Argumenthandle(){

        return new StatusMessage(resultEnum.error_inside.getCode(),resultEnum.error_inside.getMessage());
    }
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public StatusMessage handle(){

        return new StatusMessage(resultEnum.error_outside.getCode(),resultEnum.error_outside.getMessage());
    }


}

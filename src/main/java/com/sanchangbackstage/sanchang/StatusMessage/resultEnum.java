package com.sanchangbackstage.sanchang.StatusMessage;

public enum resultEnum {
    success(),
    error_outside(400,"请求错误"),
    error_inside(500,"接口内部错误"),;


    private int code;
    private String message;

    resultEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }



    resultEnum(){
        this.code=200;
        this.message="success";
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}

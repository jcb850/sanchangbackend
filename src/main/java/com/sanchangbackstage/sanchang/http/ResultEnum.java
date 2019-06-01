package com.sanchangbackstage.sanchang.http;

public enum  ResultEnum {

    SUCCESS(200,"请求成功"),

    /**数据不存在返回*/
    NOT_FOUND(404,"接口不存在"),

    /**异常返回*/
    ERROR(500,"error [未知异常]"),

    /**参数有异常返回*/
    PARAMETER_ERROR(-1,"parameter error [参数异常:参数为空或者参数类型不符]");

    private Integer code;

    private String msg;

    private ResultEnum(Integer code,String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }


}

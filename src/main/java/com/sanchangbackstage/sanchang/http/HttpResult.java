package com.sanchangbackstage.sanchang.http;

public class HttpResult {
    //返回状态码
    private Integer code;
    //返回实体数据
    private Object data;
    //返回提示信息
    private String message;
    public HttpResult(Integer code,String message,Object data){
        this.code = code;
        this.message = message;
        this.data = data;
    }
    @Override
    public String toString() {
        return "Result [code=" + code + ", message=" + message + ", data=" + data + "]";
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

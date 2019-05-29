package com.sanchangbackstage.sanchang.StatusMessage;

public class StatusMessage {
    public StatusMessage() {
        this.code = 200;
        this.message = "success";
        this.data = null;

    }
    public StatusMessage(int code ,String message) {
        this.code = code;
        this.data = null;
        this.message = message;
    }
    public StatusMessage(Object data){
        this.data = data;
        this.message = "success";
        this.code=200;
    }

    public StatusMessage(int code, Object data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    private int code;
    private Object data;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
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

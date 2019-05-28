package com.sanchangbackstage.sanchang.StatusMessage;

public class StatusMessage {
    public StatusMessage() {
        this.message = "success";
        this.data = null;

    }
    public StatusMessage(String message) {
        this.data = null;
        this.message = message;
    }
    public StatusMessage(Object data){
        this.data = data;
        this.message = "success";
    }
    private Object data;
    private String message;

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

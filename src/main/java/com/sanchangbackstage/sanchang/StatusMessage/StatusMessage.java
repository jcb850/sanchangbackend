package com.sanchangbackstage.sanchang.StatusMessage;

public class StatusMessage {
    public StatusMessage() {
        this.message = "success";
    }
    public StatusMessage(String message) {
        this.message = message;
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

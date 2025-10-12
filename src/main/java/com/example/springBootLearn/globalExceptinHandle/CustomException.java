package com.example.springBootLearn.globalExceptinHandle;

public class CustomException extends RuntimeException{
    String status;
    String msg;

    public CustomException(String status, String msg) {
        super(msg);
        this.status = status;
        this.msg = msg;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String getMessage() {
        return msg;
    }
}

package com.example.demo;

public class PingRequest {
    private String message;

    public PingRequest() {
    }

    public PingRequest(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
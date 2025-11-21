package com.example.demo;

public class PingResponse {
    private String status;
    private String echo;

    public PingResponse() {
    }

    public PingResponse(String status, String echo) {
        this.status = status;
        this.echo = echo;
    }

    public String getStatus() {
        return status;
    }

    public String getEcho() {
        return echo;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setEcho(String echo) {
        this.echo = echo;
    }
}
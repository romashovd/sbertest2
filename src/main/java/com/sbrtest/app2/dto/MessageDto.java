package com.sbrtest.app2.dto;

public class MessageDto {
    private String body;
    private String name;
    private String secondname;

    public MessageDto() {
    }

    public MessageDto(String secondname, String name, String body){
        this.name = name;
        this.body = body;
        this.secondname = secondname;

    }

    public String getBody() {

        return body;
    }

    public void setBody(String body) {

        this.body = body;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }
}
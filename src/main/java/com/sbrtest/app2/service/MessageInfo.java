package com.sbrtest.app2.service;

import java.util.Date;

public class MessageInfo {

    private Integer ID; //уникальный идентификатор сообщения

    private String Name; //Имя

    private String SecondName; //Фамилия

    private String Body; // текст сообщения

    private Date Timestamp; //дата

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSecondName() {
        return SecondName;
    }

    public void setSecondName(String secondName) {
        SecondName = secondName;
    }

    public String getBody() {
        return Body;
    }

    public void setBody(String body) {
        Body = body;
    }

    public Date getTimestamp() {
        return Timestamp;
    }

    public void setTimestamp(Date timestamp) {
        Timestamp = timestamp;
    }
}

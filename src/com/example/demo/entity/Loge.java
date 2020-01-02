package com.example.demo.entity;

import java.util.Date;

/**
 * @author 曹郁楠
 */
public class Loge {
    private Integer id;
    private String text;
    private Date date;

    @Override
    public String toString() {
        return "Loge{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", date=" + date +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Loge() {
    }

    public Loge(Integer id, String text, Date date) {
        this.id = id;
        this.text = text;
        this.date = date;
    }
}

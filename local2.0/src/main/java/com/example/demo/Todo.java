package com.example.demo;

import java.util.UUID;

public class Todo {
    private String title;
    private String detail;
    private String id;

    Todo ()
    {

    }

    public Todo(String title, String detail) {
        this.title = title;
        this.detail = detail;
        this.id=UUID.randomUUID().toString();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

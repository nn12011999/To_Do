package com.example.demo.Entity;

import javax.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "Todo")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private User user_id;


    private String title;
    private String detail;


    public Todo ()
    {
    }

    public User getUser() {
        return user_id;
    }

    public void setUser(User user) {
        this.user_id = user;
    }

    public Todo(String title, String detail) {
        this.title = title;
        this.detail = detail;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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


}

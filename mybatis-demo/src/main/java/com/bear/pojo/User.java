package com.bear.pojo;

public class User {
    private Integer user_id;
    private String username;
    private String ustatus;

    public Integer getUser_id() {
        return user_id;
    }

    public String getUsername() {
        return username;
    }

    public String getUstatus() {
        return ustatus;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUstatus(String ustatus) {
        this.ustatus = ustatus;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", username='" + username + '\'' +
                ", ustatus='" + ustatus + '\'' +
                '}';
    }

    public User(Integer user_id, String username, String ustatus) {
        this.user_id = user_id;
        this.username = username;
        this.ustatus = ustatus;
    }

    public User() {
    }
}

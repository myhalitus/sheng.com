package com.bear.pojo;

public class User {

    private Integer id;
    private String userName;
    private String ustatus;

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getUstatus() {
        return ustatus;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUstatus(String ustatus) {
        this.ustatus = ustatus;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", ustatus='" + ustatus + '\'' +
                '}';
    }
}

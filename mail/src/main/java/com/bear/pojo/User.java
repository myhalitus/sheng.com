package com.bear.pojo;

import java.io.Serializable;

// User 表的实体类 POJO
public class User implements Serializable {

    private String userName;

    private String userNumber;

    public String getUserName() {
        return userName;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

}

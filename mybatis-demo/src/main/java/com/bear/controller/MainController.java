package com.bear.controller;

import com.bear.pojo.User;

import java.util.ArrayList;
import java.util.List;

public class MainController {

    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        for (User user : list) {
            System.out.println(user.getUsername());
        }
    }
}

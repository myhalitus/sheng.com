package com.bear.service;

import com.bear.pojo.User;

import java.util.List;

public interface UserService {

    List<User> selectUserService() throws Exception;

    void insertUserService(User user) throws  Exception;

    void delUserService(int id) throws Exception;

    void updateUserService(User user) throws Exception;
}

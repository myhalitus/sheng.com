package com.bear.service;

import com.bear.mapper.UserMapper;
import com.bear.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public User Sel(int id) {
        return userMapper.Sel(id);
    }

    public void InsertUser(User user) {
        userMapper.InsertUser(user);
    }

    public void UpdateUser(User user) {
        userMapper.UpdateUser(user);
    }

    public void DeleteUser(int id) {
        userMapper.DeleteUser(id);
    }
}

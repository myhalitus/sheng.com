package com.bear.mapper;

import com.bear.pojo.User;

import java.util.List;

public interface UserMapper {

    public List<User> selectUser() throws Exception;

    public void insertUser(User user) throws  Exception;

    public void delUser(int td) throws Exception;

    public void updateUser(User uses) throws Exception;

}

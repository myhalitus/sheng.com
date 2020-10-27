package com.bear.Mapper.Dao;

import com.bear.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {

    List<User> queryUserList();

}

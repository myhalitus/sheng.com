package com.bear.service.impl;

import com.bear.pojo.User;
import com.bear.service.UserService;
import com.bear.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;


import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public List<User> selectUserService() throws Exception {
        SqlSession session = SqlSessionUtil.getSession("mybatis-config.xml");
        return session.selectList("com.bear.mapper.selectUser", User.class);
    }

    @Override
    public void insertUserService(User user) throws Exception {
        SqlSession session = SqlSessionUtil.getSession("mybatis-config.xml");
        session.insert("com.bear.mapper.insertUser");
    }

    @Override
    public void delUserService(int id) throws Exception {
        SqlSession session= SqlSessionUtil.getSession("mybatis-config.xml");
        // TODO Auto-generated method stub
        session.delete("com.bear.mapper.delUser",id);
    }

    @Override
    public void updateUserService(User user) throws Exception {
        // TODO Auto-generated method stub
        SqlSession session= SqlSessionUtil.getSession("mybatis-config.xml");
        session.update("com.bear.mapper.updateUser",user);
    }
}

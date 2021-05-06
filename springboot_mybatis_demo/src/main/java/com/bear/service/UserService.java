package com.bear.service;

import com.bear.mapper.UserMapper;
import com.bear.pojo.User;
import com.bear.util.Pager;
import org.apache.ibatis.javassist.expr.NewArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public Pager<User> findByPager(int page, int size) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("page", page);
        params.put("size", size);
        Pager<User> pager = new Pager<User>();
        List<User> list = userMapper.findByPager(params);
        pager.setRows(list);
        pager.setTotal(userMapper.count());
        return  pager;
    }


}

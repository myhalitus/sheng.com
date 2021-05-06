package com.bear.mapper;

import com.bear.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UserMapper {
    User Sel(int id);

    public void InsertUser(User user);

    public void UpdateUser(User user);

    public void DeleteUser(int id);

    public List<User> findByPager(Map<String, Object> params);

    public long count();
}

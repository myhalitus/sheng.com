package com.bear.mapper;

import com.bear.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User Sel(int id);
}

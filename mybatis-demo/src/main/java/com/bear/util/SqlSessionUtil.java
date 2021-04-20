package com.bear.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.IOException;
import java.io.InputStream;

public class SqlSessionUtil {

    public static SqlSession getSession(String config) throws IOException {
        InputStream inputStream = Resources.getResourceAsStream(config);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        return sessionFactory.openSession();
    }
}

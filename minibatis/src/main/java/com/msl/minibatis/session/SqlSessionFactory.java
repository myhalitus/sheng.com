package com.msl.minibatis.session;

public class SqlSessionFactory {

    private Configuration configuration;

    /**
     * build方法用于初始化Configuration，解析配置文件的工作在Configuration的构造函数中
     *
     * @return
     */
    public SqlSessionFactory build() {
        configuration = new Configuration();
        return this;
    }

    /**
     * 获取DefaultSqlSession
     *
     * @return
     */
    public DefaultSqlSession openSqlSession() {
        return new DefaultSqlSession(configuration);
    }
}

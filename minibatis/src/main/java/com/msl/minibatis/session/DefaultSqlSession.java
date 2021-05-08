package com.msl.minibatis.session;

import com.msl.minibatis.executor.Executor;

public class DefaultSqlSession {

    private Configuration configuration;

    private Executor executor;

    public DefaultSqlSession(Configuration configuration) {
        this.configuration = configuration;
        // 根据全局配置决定是否使用缓存装饰
        this.executor = configuration.newExecutor();
    }

    public Configuration getConfiguration() {
        return configuration;
    }

    /**
     * 获取mapper
     *
     * @param clazz
     * @param <T>
     * @return
     */
    public <T> T getMapper(Class<T> clazz) {
        return configuration.getMapper(clazz, this);
    }

    /**
     * 1.根据statement获取配置类中的具体sql语句
     * 2.调用executor.query方法，executor.query会处理入参，查询语句，并且将ResultSet封装成pojo类返回
     *
     * @param statement
     * @param parameter
     * @param pojo
     * @param <T>
     * @return
     */
    public <T> T selectOne(String statement, Object[] parameter, Class pojo) {
        String sql = getConfiguration().getMappedStatement(statement);
        return executor.query(sql, parameter, pojo);
    }


}

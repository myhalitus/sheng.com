package com.msl.minibatis.executor;

public interface Executor {
    <T> T query(String statement, Object[] parameter, Class pojo);
}

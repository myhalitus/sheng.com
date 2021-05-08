package com.msl.minibatis.cache;

public interface CacheFactory {

    boolean containsKey(int key);

    Object get(int key);

    void put(int key, Object value);
}

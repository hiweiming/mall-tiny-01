package com.macro.mall.tiny.service.impl;

import com.macro.mall.tiny.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * RedisServiceImpl
 * 创建人: yuanweiming
 *
 * @author YuanWeiMing
 * @version 1.0
 * 2019/9/2 14:46
 **/
@Service
public class RedisServiceImpl implements RedisService {
    //注入StringRedisTemplate，实现RedisService接口
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    /**
     * 存储数据
     */
    @Override
    public void set(String key, String value) {
        stringRedisTemplate.opsForValue().set(key,value);
    }
    /**
     * 获取数据
     */
    @Override
    public String get(String key) {
        return stringRedisTemplate.opsForValue().get(key);
    }
    /**
     * 设置超期时间
     */
    @Override
    public boolean expire(String key, long expire) {
        return stringRedisTemplate.expire(key, expire,TimeUnit.SECONDS);
    }
    /**
     * 删除数据
     */
    @Override
    public void remove(String key) {
        stringRedisTemplate.delete(key);
    }
    /**
     * 自增操作
     * @param delta 自增步长
     */
    @Override
    public Long increment(String key, long delta) {
        return stringRedisTemplate.opsForValue().increment(key,delta);
    }
}

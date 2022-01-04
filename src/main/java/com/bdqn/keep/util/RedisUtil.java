package com.bdqn.keep.util;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author AiWba
 * @create -12-15-16:02
 */
@Component
public class RedisUtil {
    @Resource
    private RedisTemplate<String,Object> redisTemplate;
    /**
     * 往redis中存数据
     * @param key
     * @param object
     * @return
     */
    public boolean set(String key,Object object){
        ValueOperations<String,Object> vo=redisTemplate.opsForValue();
        vo.set(key,object);
        return true;
    }
    /**
     * 往redis中存数据
     * @param key
     * @return
     */
    public Object get(String key){
        ValueOperations<String,Object> ov=redisTemplate.opsForValue();
        return ov.get(key);
    }


}

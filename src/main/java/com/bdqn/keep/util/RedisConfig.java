package com.bdqn.keep.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @author AiWba
 * @create -12-15-15:38
 */
@Configuration
public class RedisConfig {
    @Bean
//    参数RedisConnectionFactory为Spring Boot自动注入
    public RedisTemplate<String,Object> redisTemplate(RedisConnectionFactory factory){
        RedisTemplate<String,Object> redisTemplate=new RedisTemplate<String, Object>();
        redisTemplate.setConnectionFactory(factory);
        return redisTemplate;
    }
}

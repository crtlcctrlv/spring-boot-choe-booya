package com.choe.practice.boot.booya.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class CacheConfig {

  @Bean
  public RedisTemplate<String, Object> jdkRedisTemplate(
      RedisConnectionFactory redisConnectionFactory) {

    RedisSerializer<String> stringRedisSerializer = new StringRedisSerializer();
    RedisSerializer<Object> jdkSerializationRedisSerializer = new JdkSerializationRedisSerializer();

    RedisTemplate<String, Object> template = new RedisTemplate<>();
    template.setConnectionFactory(redisConnectionFactory);
    template.setKeySerializer(stringRedisSerializer);
    template.setValueSerializer(jdkSerializationRedisSerializer);
    template.setHashKeySerializer(stringRedisSerializer);
    template.setHashValueSerializer(jdkSerializationRedisSerializer);
    template.afterPropertiesSet();
    return template;
  }

  @Bean
  public RedisTemplate<String, Object> jsonRedisTemplate(
      RedisConnectionFactory redisConnectionFactory) {

    RedisSerializer<String> stringRedisSerializer = new StringRedisSerializer();
    GenericJackson2JsonRedisSerializer genericJackson2JsonRedisSerializer =
        new GenericJackson2JsonRedisSerializer();

    RedisTemplate<String, Object> template = new RedisTemplate<>();
    template.setConnectionFactory(redisConnectionFactory);
    template.setKeySerializer(stringRedisSerializer);
    template.setValueSerializer(genericJackson2JsonRedisSerializer);
    template.setHashKeySerializer(stringRedisSerializer);
    template.setHashValueSerializer(genericJackson2JsonRedisSerializer);
    template.afterPropertiesSet();
    return template;
  }

}

package com.example.loginservice.controller;

import com.example.loginservice.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;
import java.util.UUID;

/**
 * @Author leezihong
 * @Date 2023/2/10 14:33
 * @Version 1.0
 * @description TODO
 */

@RestController
@CrossOrigin //跨域
public class LoginController {

    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping("doLogin")
    public String doLogin(String username, String password) {

        User user = new User(1,username,password);

        String token= UUID.randomUUID().toString();
        redisTemplate.opsForValue().set(token,user.toString(), Duration.ofSeconds(7200));
        return token;
    }
}

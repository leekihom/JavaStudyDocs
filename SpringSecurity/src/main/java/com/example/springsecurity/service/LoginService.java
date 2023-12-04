package com.example.springsecurity.service;

import com.example.springsecurity.domain.ResponseResult;
import com.example.springsecurity.domain.User;

/**
 * @Author leezihong
 * @Date 2022/12/16 11:32
 * @Version 1.0
 * @description TODO
 */
public interface LoginService {

    ResponseResult login(User user);

    ResponseResult logout();
}

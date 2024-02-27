package com.example.test.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.test.entity.User;

/**
 * (User)表服务接口
 *
 * @author leezihong
 * @since 2023-12-23 16:08:47
 */


public interface UserService extends IService<User> {

    void insert(User user);
}


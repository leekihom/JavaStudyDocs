package com.example.test.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.test.entity.User;
import com.example.test.mapper.UserMapper;
import com.example.test.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * (User)表服务实现类
 *
 * @author leezihong
 * @since 2023-12-23 16:08:47
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    @Transactional
    public void insert(User user) {
        if (Boolean.TRUE){
            throw new RuntimeException("error");
        }
        this.baseMapper.insert(user);
    }

}


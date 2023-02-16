package com.example.account.service.impl;

import com.example.account.domain.CommonResult;
import com.example.account.mapper.AccountMapper;
import com.example.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @Author leezihong
 * @Date 2023/2/15 23:43
 * @Version 1.0
 * @description TODO
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public CommonResult decrease(Long userId, BigDecimal money) {
        accountMapper.decrease(userId,money);
        return new CommonResult(200,"Successfully decrease","Successfully");
    }
}

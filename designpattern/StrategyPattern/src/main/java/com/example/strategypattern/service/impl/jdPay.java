package com.example.strategypattern.service.impl;

import com.example.strategypattern.service.payService;
import org.springframework.stereotype.Service;

/**
 * @Author leezihong
 * @Date 2023/4/13 16:53
 * @Version 1.0
 * @description TODO
 */

@Service
public class jdPay implements payService {
    @Override
    public String getType() {
        return "jdPay";
    }

    @Override
    public void pay(int money) {
        System.out.println(getType() + "-----" + money);
    }
}

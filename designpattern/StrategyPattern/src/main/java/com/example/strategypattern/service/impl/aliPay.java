package com.example.strategypattern.service.impl;

import com.example.strategypattern.service.payService;
import org.springframework.stereotype.Service;

/**
 * @Author leezihong
 * @Date 2023/4/13 16:52
 * @Version 1.0
 * @description TODO
 */

@Service
public class aliPay implements payService {
    @Override
    public String getType() {
        return "aliPay";
    }

    @Override
    public void pay(int money) {
        System.out.println(getType() + "-----" + money);
    }
}

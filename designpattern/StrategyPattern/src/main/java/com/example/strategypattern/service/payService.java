package com.example.strategypattern.service;

/**
 * @Author leezihong
 * @Date 2023/4/13 16:50
 * @Version 1.0
 * @description TODO
 */
public interface payService {

    String getType();
    void pay(int money);
}

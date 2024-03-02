package com.example.strategypattern.service.impl;

import com.example.strategypattern.service.payService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author leezihong
 * @Date 2023/4/13 16:56
 * @Version 1.0
 * @description TODO
 */

@Service
public class Pay {

    Map<String, payService> payServiceMap = new HashMap<>();


    public Pay(List<payService> payServiceList){
        payServiceList.stream().forEach(payService -> payServiceMap.put(payService.getType(), payService));
    }

    public void pay(String type, int amount){
        payServiceMap.get(type).pay(amount);
    }

}

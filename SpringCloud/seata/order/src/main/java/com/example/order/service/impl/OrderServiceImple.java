package com.example.order.service.impl;

import com.example.order.domain.Order;
import com.example.order.mapper.OrderMapper;
import com.example.order.service.AccountService;
import com.example.order.service.OrderService;
import com.example.order.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @Author leezihong
 * @Date 2023/2/15 22:40
 * @Version 1.0
 * @description TODO
 */

@Service
@Slf4j
public class OrderServiceImple implements OrderService {

    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private StorageService storageService;
    @Autowired
    private AccountService accountService;

    @Override
    @GlobalTransactional
    public void create(Order order) {
        log.info("开始创建订单--------------------------------");
        orderMapper.create(order);
        log.info("订单开始减除库存-------------------------------");
        storageService.decrease(order.getProductId(), order.getCount());
        log.info("订单开始减除库存-------------------------------end");
        log.info("订单开始减除账户金额-------------------------------");
        accountService.decrease(order.getUserId(), order.getMoney());
        log.info("订单开始减除账户金额-------------------------------end");
        log.info("修改订单状态--------------------------------");
        orderMapper.update(order.getUserId(),0);

    }
}

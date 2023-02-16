package com.example.order.controller;


import com.example.order.domain.CommonResult;
import com.example.order.domain.Order;
import com.example.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author leezihong
 * @Date 2023/2/15 23:08
 * @Version 1.0
 * @description TODO
 */

@RestController
public class seataOrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order) {

        orderService.create(order);
        return new CommonResult(200,"Order created","Order created");
    }

}

package com.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author leezihong
 * @Date 2022/12/25 22:54
 * @Version 1.0
 * @description TODO
 */
@RestController
public class OrderController {

    @GetMapping("doOrder")
    public String doOrder(){
        return "Order";
    }
}

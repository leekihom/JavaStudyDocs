package com.userservice.controller;

import com.userservice.feign.UserOrderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author leezihong
 * @Date 2022/12/25 22:50
 * @Version 1.0
 * @description TODO
 */

@RestController
public class UserController {

    @Autowired
    public UserOrderFeign userOrderFeign;

    /**
     * feign远程调用有时间的限制，默认 1s
     * @return
     */
    @GetMapping("userDoOrder")
    public String userDoOrder(){

        System.out.println("USER IN");
        String s = userOrderFeign.doOrder();
        return  s;
    }
}

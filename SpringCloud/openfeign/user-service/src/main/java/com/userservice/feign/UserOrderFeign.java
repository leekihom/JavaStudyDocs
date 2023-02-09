package com.userservice.feign;

import com.userservice.entity.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @Author leezihong
 * @Date 2022/12/25 22:53
 * @Version 1.0
 * @description TODO
 */

/**
 * @FeignClient(value = "order-service")
 * value 是提供者的应用名称
 */
@FeignClient(value = "order-service")
public interface UserOrderFeign {

    /**
     * 需要调用哪个接口就直接匹配上对应的名称就可以调用
     * OrderController --> doOrder
     */

    @GetMapping("doOrder")
    public String doOrder();

    @GetMapping("testUrl/{}/and/{}")
    public String testUrl(@PathVariable("name") String name, @PathVariable("age") String age);

    @GetMapping("oneParam")
    public String oneParam(@RequestParam(required = false) String name);

    @GetMapping("twoParam")
    public String twoParam(@RequestParam(required = false) String name,@RequestParam(required = false) String age);

    @PostMapping("oneObj")
    public String oneObj(@RequestBody Order order);

    @PostMapping("oneObjoneParam")
    public String oneObjoneParam(@RequestBody Order order, @RequestParam("name") String name);

    @GetMapping("testTime")
    public String testTime(@RequestParam Date date);
}

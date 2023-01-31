package com.orderservice.controller;

import com.orderservice.entity.Order;
import org.springframework.web.bind.annotation.*;

/**
 * @Author leezihong
 * @Date 2023/1/15 10:41
 * @Version 1.0
 * @description TODO
 *
 *  url
 */


@RestController
public class ParamController {

    @GetMapping("testUrl/{}/and/{}")
    public String testUrl(@PathVariable("name") String name, @PathVariable("age") String age) {
        System.out.println(name+":"+age);
        return "ok";
    }

    @GetMapping("oneParam")
    public String oneParam(@RequestParam(required = false) String name) {
        System.out.println("name"+name);
        return "ok";
    }

    @GetMapping("twoParam")
    public String twoParam(@RequestParam(required = false) String name,@RequestParam(required = false) String age) {
        System.out.println("name:"+name+"---"+"age:"+age);
        return "ok";
    }

    @PostMapping("oneObj")
    public String oneObj(@RequestBody Order order) {
        System.out.println(order);
        return "ok";
    }

    @PostMapping("oneObjoneParam")
    public String oneObjoneParam(@RequestBody Order order,@RequestParam("name") String name) {
        System.out.println(order+"----name:"+name);
        return "ok";
    }
}

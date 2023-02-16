package com.example.sentinel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author leezihong
 * @Date 2023/2/13 21:18
 * @Version 1.0
 * @description TODO
 */

@RestController
public class SentinelController {

    @GetMapping("get")
    public String get(){
        return "Got it";
    }
}

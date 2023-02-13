package com.example.nacosclientb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author leezihong
 * @Date 2023/2/11 16:45
 * @Version 1.0
 * @description TODO
 */

@RestController
public class OpenFeignTest {


    @GetMapping("/openFeign")
    public String FeignTest() {
        return "OpenFeign GET Pass 8082";
    }
}


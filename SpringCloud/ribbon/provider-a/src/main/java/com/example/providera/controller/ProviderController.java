package com.example.providera.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author leezihong
 * @date 2022/12/11 16:46
 * @description
 */
@RestController
public class ProviderController {

    @GetMapping("/hello")
    public String Hello(){
        return "提供者A";
    }
}

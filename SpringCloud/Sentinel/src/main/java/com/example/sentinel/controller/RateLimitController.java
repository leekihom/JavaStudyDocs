package com.example.sentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.example.sentinel.handler.customerBlockHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author leezihong
 * @Date 2023/2/14 15:44
 * @Version 1.0
 * @description TODO
 */

@RestController
public class RateLimitController {

    @GetMapping("/byResource")
    /**
     * blockHandler使用的方法必须和value的方法返回值一致，并且是public的，同时也需要加一个参数BlockException
     */
    @SentinelResource(value = "byResource",blockHandler = "handleException")
    public String byResource(){
        return "byResource get pass";
    }

    public String handleException(BlockException exception){
        return "handleException 服务不可用";
    }

    @GetMapping("/byUrl")
    @SentinelResource(value = "byUrl",blockHandler = "handleException")
    public String byUrl(){
        return "byUrl get pass";
    }

    @GetMapping("/customerBlockHandler")
    @SentinelResource(value = "customerBlockHandler",blockHandlerClass = customerBlockHandler.class,blockHandler="handlerException")
    public String customerBlockHandler(){
        return "自定义处理逻辑";
    }

    @GetMapping("/fallback")
    @SentinelResource(value = "fallback",fallback = "fallbackHandler")
    public String fallback(){
        return "fallback";
    }

    public String fallbackHandler(){
        return "fallbackHandler get pass";
    }
}

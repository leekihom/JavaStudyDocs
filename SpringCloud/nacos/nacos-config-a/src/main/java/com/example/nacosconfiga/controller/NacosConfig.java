package com.example.nacosconfiga.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author leezihong
 * @Date 2023/2/11 19:20
 * @Version 1.0
 * @description TODO
 */

@RestController
@RefreshScope  //让其更改后刷新就可以直接生效，不重启
public class NacosConfig {

    @Value("${info.user}")
    private String user;

    @Value("${info.name}")
    private String name;

    @GetMapping("getInfo")
    public String getInfo(){


        return "user: " + user+"----- name: " + name;
    }
}

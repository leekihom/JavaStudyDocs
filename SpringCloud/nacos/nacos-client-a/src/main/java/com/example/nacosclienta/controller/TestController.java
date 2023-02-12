package com.example.nacosclienta.controller;

import com.example.nacosclienta.openfeign.TestFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author leezihong
 * @Date 2023/2/11 15:21
 * @Version 1.0
 * @description TODO
 */

@RestController
public class TestController {

    @Autowired
    public DiscoveryClient discoveryClient;

    @Autowired
    public TestFeign testFeign;

    @GetMapping("test")
    public String test() {
        List<ServiceInstance> serviceInstanceList = discoveryClient.getInstances("nacos-client-b");

        return serviceInstanceList.get(0).toString();
    }

    @GetMapping("testfeign")
    public String getTestFeign() {
        return testFeign.FeignTest();
    }
}

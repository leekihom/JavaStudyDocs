package com.example.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DiscoveryController {

    @Autowired
    //org.springframework.cloud.client.discovery.DiscoveryClient
    private DiscoveryClient discoveryClient;

    /**
     * 通过应用名称找到服务的ip和端口
     * @param serviceName
     * @return
     */
    @GetMapping("test")
    public String doDiscovery(String serviceName){
        //服务发现，通过服务名，获取服务集合
        List<ServiceInstance> instances = discoveryClient.getInstances(serviceName);

        instances.forEach(System.out::println);
        ServiceInstance serviceInstance = instances.get(0);
        String port = serviceInstance.getHost();
        System.out.printf("ip:"+port);

        return instances.get(0).toString();
    }
}

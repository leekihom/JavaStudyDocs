package com.example.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author leezihong
 * @date 2022/12/11 17:11
 * @description
 */
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("testRibbon")
    public String testRibbon(String serviceName){
        /**
         * restTemplate的bean被ribbon接管之后，ribbon会根据serverName去寻找提供者
         * ribbon先拦截请求
         * 再寻找主机名serviceName
         * 借助eureka来做服务发现
         * 然后根据负载均衡的算法来选取一个服务 获取ip 端口
         * 最后发送请求
         */
        String result = restTemplate.getForObject("http://"+serviceName+"/hello",String.class);
        return result;
    }

    @GetMapping("testRibbonRule")
    public String testRibbonRule(String serviceName){
        ServiceInstance choose = loadBalancerClient.choose(serviceName);
        return choose.toString();
    }
}

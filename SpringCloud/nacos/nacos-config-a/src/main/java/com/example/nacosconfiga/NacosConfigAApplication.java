package com.example.nacosconfiga;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigAApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosConfigAApplication.class, args);
    }

}

package com.example.orderserviceb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OrderServiceBApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceBApplication.class, args);
    }

}

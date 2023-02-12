package com.example.gatewayserver.config;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import reactor.core.publisher.Mono;

/**
 * @Author leezihong
 * @Date 2023/2/10 23:03
 * @Version 1.0
 * @description 自定义请求限制
 */

@Configuration
public class RequestLimitConfig {


    @Bean(name = "ipKeyResolver")
    @Primary
    public KeyResolver ipKeyResolver(){
        return exchange -> Mono.just(exchange.getRequest().getHeaders().getHost().getHostString());
    }

    @Bean(name = "apiKeyResolver")
    public KeyResolver apiKeyResolver(){
        return exchange -> Mono.just(exchange.getRequest().getPath().value());
    }

}

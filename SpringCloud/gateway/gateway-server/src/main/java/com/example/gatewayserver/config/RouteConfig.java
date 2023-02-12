package com.example.gatewayserver.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author leezihong
 * @Date 2023/2/10 15:18
 * @Version 1.0
 * @description 代码方式配置路由
 */

@Configuration
public class RouteConfig {

        @Bean
        public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
            return builder.routes()
                    .route("test_id", r -> r.path("/get")
                            .uri("http://httpbin.org"))
                    .build();
        }
}

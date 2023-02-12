package com.example.gatewayserver.filter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @Author leezihong
 * @Date 2023/2/10 18:55
 * @Version 1.0
 * @description TODO
 */

@Component
public class TokenFilter implements GlobalFilter, Ordered {


    public static final List<String> ALLOW_URL = Arrays.asList("/login-service/doLogin","/doLogin");

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        ServerHttpRequest request = exchange.getRequest();
        String path = request.getURI().getPath();
        if (ALLOW_URL.contains(path)) {
            return chain.filter(exchange);
        }

        String token = request.getHeaders().get("Authorization").get(0).toString();

        if (!token.isEmpty()) {
            if (redisTemplate.hasKey(token)) {
                return chain.filter(exchange);
            }
        }

        ServerHttpResponse response = exchange.getResponse();
        response.getHeaders().set("content-type", "application/json;charset=utf-8");

        HashMap<String, Object> map = new HashMap<String, Object>(4);
        map.put("code", HttpStatus.UNAUTHORIZED);
        map.put("msg", "未授权");
        ObjectMapper objectMapper = new ObjectMapper();
        byte[] bytes = new byte[0];
        try {
            bytes = objectMapper.writeValueAsBytes(map);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        DataBuffer data = response.bufferFactory().wrap(bytes);
        return response.writeWith(Mono.just(data));
    }

    @Override
    public int getOrder() {
        return 3;
    }
}

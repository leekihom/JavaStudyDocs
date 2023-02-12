package com.example.gatewayserver.filter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @Author leezihong
 * @Date 2023/2/10 18:02
 * @Version 1.0
 * @description ip拦截
 */

@Component
public class IPCheckFilter implements GlobalFilter, Ordered {


    private static final List<String> Black_List= Arrays.asList("127.0.0.1");

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        ServerHttpRequest request = exchange.getRequest();
        String ip = request.getHeaders().getHost().getHostString();
        if (!Black_List.contains(ip)) {
            return chain.filter(exchange);
        }

        ServerHttpResponse response =  exchange.getResponse();

        response.getHeaders().set("content-type","application/json;charset=utf-8");

        HashMap<String,Object> map = new HashMap<String,Object>(4);
        map.put("code", 438);
        map.put("msg","黑名单");
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
        return 1;
    }
}

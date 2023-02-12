package com.example.gatewayserver.filter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.HashMap;

/**
 * @Author leezihong
 * @Date 2023/2/10 17:10
 * @Version 1.0
 * @description TODO
 */

@Component
public class MyGlobalFilter implements GlobalFilter, Ordered {


    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        ServerHttpRequest request = exchange.getRequest();

        String path = request.getURI().getPath();

        HttpHeaders headers = request.getHeaders();

        String methodName = request.getMethod().name();

        String hostName = request.getRemoteAddress().getHostName();

        String ip = request.getHeaders().getHost().getHostString();

        ServerHttpResponse response =  exchange.getResponse();

        response.getHeaders().set("content-type","application/json;charset=utf-8");

        HashMap<String,Object> map = new HashMap<String,Object>(4);
        map.put("code", HttpStatus.UNAUTHORIZED);
        map.put("msg","未授权");
        ObjectMapper objectMapper = new ObjectMapper();
        byte[] bytes = new byte[0];

        try {
            bytes = objectMapper.writeValueAsBytes(map);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        DataBuffer data = response.bufferFactory().wrap(bytes);

//        return response.writeWith(Mono.just(data));
        return chain.filter(exchange);

    }

    @Override
    public int getOrder() {
        return 2;
    }
}

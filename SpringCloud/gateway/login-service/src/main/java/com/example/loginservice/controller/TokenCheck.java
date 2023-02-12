package com.example.loginservice.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.HashMap;

/**
 * @Author leezihong
 * @Date 2023/2/10 19:39
 * @Version 1.0
 * @description TODO
 */
@RestController
public class TokenCheck {


    @GetMapping("tokenCheck")
    public String tokenCheck() {

        return "CHECK PASS";
    }
}

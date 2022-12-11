package com.example.resttemplate.controller;

import com.example.resttemplate.domain.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class testController {

    @GetMapping("testGet")
    public String get(String name){
        System.out.println(name);
        return "OK";
    }

    @PostMapping("testPost1")
    public String testPost1(@RequestBody User user){
        System.out.println(user);
        return "OK";
    }

    @PostMapping("testPost2")
    public String testPost2(User user){
        System.out.println(user);
        return "OK";
    }

}

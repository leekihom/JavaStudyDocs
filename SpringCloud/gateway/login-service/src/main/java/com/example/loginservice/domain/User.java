package com.example.loginservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author leezihong
 * @Date 2023/2/10 18:43
 * @Version 1.0
 * @description TODO
 */
@Data
@AllArgsConstructor
public class User {

    private Integer id;
    private String username;
    private String password;
}

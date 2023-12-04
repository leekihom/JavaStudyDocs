package com.example.springsecurity;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @Author leezihong
 * @Date 2022/12/15 22:34
 * @Version 1.0
 * @description TODO
 */
public class BCryptPasswordEncoderTest {

    @Test
    public void test(){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        System.out.println(passwordEncoder.encode("123"));
    }
}

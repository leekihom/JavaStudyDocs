package com.example.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.example.test.mapper")
public class OtherTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(OtherTestApplication.class, args);
    }

}

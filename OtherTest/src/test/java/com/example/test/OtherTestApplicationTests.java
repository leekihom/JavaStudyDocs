package com.example.test;

import com.example.test.service.TransactionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class OtherTestApplicationTests {

    @Autowired
    private TransactionService service;

    @Test
    void contextLoads() {
        service.saveAll();
    }

}

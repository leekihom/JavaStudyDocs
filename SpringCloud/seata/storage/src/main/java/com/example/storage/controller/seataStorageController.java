package com.example.storage.controller;

import com.example.storage.domain.CommonResult;
import com.example.storage.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @Author leezihong
 * @Date 2023/2/15 23:38
 * @Version 1.0
 * @description TODO
 */

@RestController
public class seataStorageController {

    @Autowired
    private StorageService storageService;

    @PostMapping("/storage/decrease")
    public CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count) {

        storageService.decrease(count, productId);
        return new CommonResult(200,"Order created","Order created");
    }
}

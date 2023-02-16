package com.example.storage.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author leezihong
 * @Date 2023/2/15 23:39
 * @Version 1.0
 * @description TODO
 */
@Service
public interface StorageService {
    void decrease(@RequestParam("count")Integer count, @RequestParam("productId") Long productId);
}


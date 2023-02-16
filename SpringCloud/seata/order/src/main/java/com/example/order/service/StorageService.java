package com.example.order.service;

import com.example.order.domain.CommonResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author leezihong
 * @Date 2023/2/15 22:44
 * @Version 1.0
 * @description TODO
 */
@FeignClient(value = "storage-service")
@Service
public interface StorageService {

    @PostMapping("/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId,@RequestParam("count") Integer count);

}

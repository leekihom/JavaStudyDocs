package com.example.nacosclienta.openfeign;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author leezihong
 * @Date 2023/2/11 16:50
 * @Version 1.0
 * @description TODO
 */

@FeignClient(value = "nacos-client-b")
public interface TestFeign {

    @GetMapping("/openFeign")
    public String FeignTest();
}

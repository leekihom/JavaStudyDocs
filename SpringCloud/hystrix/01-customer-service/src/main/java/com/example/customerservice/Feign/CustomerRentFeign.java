package com.example.customerservice.Feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * fallback:熔断时调用的类
 * @author leezihong
 */
@FeignClient(value = "rent-car-service")
public interface CustomerRentFeign {

    @GetMapping("rent")
    public String rent();
}

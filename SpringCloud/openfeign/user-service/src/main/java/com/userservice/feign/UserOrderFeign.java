package com.userservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author leezihong
 * @Date 2022/12/25 22:53
 * @Version 1.0
 * @description TODO
 */

/**
 * @FeignClient(value = "order-service")
 * value 是提供者的应用名称
 */
@FeignClient(value = "order-service")
public interface UserOrderFeign {

    /**
     * 需要调用哪个接口就直接匹配上对应的名称就可以调用
     * OrderController --> doOrder
     */

    @GetMapping("doOrder")
    public String doOrder();
}

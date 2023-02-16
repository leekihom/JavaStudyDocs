package com.example.order.service;

import com.example.order.domain.Order;
import org.springframework.stereotype.Service;

/**
 * @Author leezihong
 * @Date 2023/2/15 22:39
 * @Version 1.0
 * @description TODO
 */

public interface OrderService {
    void create(Order order);
}

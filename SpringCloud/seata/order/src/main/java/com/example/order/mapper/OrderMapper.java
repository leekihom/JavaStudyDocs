package com.example.order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.order.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author leezihong
 * @Date 2023/2/15 18:37
 * @Version 1.0
 * @description TODO
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {

    void create(Order order);
    void update(@Param("userId") Long userId,@Param("status") Integer status);

}

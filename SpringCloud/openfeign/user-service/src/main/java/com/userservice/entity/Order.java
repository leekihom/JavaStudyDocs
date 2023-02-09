package com.userservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author leezihong
 * @Date 2023/1/15 10:58
 * @Version 1.0
 * @description TODO
 */


@Data
@AllArgsConstructor
@NoArgsConstructor

public class Order {

    private Integer id;
    private String name;
    private Double price;
    private Date time;


}

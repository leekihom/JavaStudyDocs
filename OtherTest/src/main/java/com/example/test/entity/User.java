package com.example.test.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author leezihong
 * @since 2023-12-23 15:49:14
 */
@Data
public class User implements Serializable {

    private Integer userId;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;

    private String comments;

    private String info;

    private String name;

    private String password;

    private Integer sex;

    private Integer addressId;



}


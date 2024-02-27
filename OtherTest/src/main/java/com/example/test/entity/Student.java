package com.example.test.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (Student)实体类
 *
 * @author leezihong
 * @since 2023-12-23 15:52:45
 */
@Data
public class Student implements Serializable {
    private Long id;

    private String studentName;


}


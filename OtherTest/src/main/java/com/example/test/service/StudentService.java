package com.example.test.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.test.entity.Student;

/**
 * (Student)表服务接口
 *
 * @author leezihong
 * @since 2023-12-23 16:09:54
 */
public interface StudentService extends IService<Student> {

    void insert(Student student);

}


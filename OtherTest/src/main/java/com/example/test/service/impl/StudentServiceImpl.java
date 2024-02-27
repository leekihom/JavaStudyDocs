package com.example.test.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.test.entity.Student;
import com.example.test.mapper.StudentMapper;
import com.example.test.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * (Student)表服务实现类
 *
 * @author leezihong
 * @since 2023-12-23 16:09:54
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

    @Override
    @Transactional
    public void insert(Student student) {
        this.baseMapper.insert(student);
    }

}


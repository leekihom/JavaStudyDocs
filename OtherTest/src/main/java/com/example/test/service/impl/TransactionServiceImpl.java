package com.example.test.service.impl;

import com.example.test.entity.Student;
import com.example.test.entity.User;
import com.example.test.service.StudentService;
import com.example.test.service.TransactionService;
import com.example.test.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author leezihong
 * @Date 2023/12/23 15:51
 * @Version 1.0
 * @description TODO
 */


@RequiredArgsConstructor
@Slf4j
@Service
public class TransactionServiceImpl implements TransactionService {

    private final StudentService studentService;
    private final UserService userService;

    @Override
    public void saveAll() {
        log.info("start---");
        Student student = new Student();
        student.setStudentName("giegie");
        studentService.insert(student);
        log.info("start 2---");
        User user = new User();
        userService.insert(user);
        log.info("end---");
    }
}

package com.example.factorypattern.service.impl;

import com.example.factorypattern.service.Shape;

/**
 * @Author leezihong
 * @Date 2023/4/14 22:32
 * @Version 1.0
 * @description TODO
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle");
    }
}
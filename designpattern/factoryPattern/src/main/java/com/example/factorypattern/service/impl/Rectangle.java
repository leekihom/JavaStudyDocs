package com.example.factorypattern.service.impl;

import com.example.factorypattern.service.Shape;

/**
 * @Author leezihong
 * @Date 2023/4/14 22:31
 * @Version 1.0
 * @description TODO
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}
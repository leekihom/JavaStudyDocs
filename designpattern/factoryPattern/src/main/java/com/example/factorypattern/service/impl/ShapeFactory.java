package com.example.factorypattern.service.impl;

import com.example.factorypattern.service.Shape;

import java.util.List;

/**
 * @Author leezihong
 * @Date 2023/4/14 22:33
 * @Version 1.0
 * @description TODO
 */
public class ShapeFactory {



    public Shape factory(String type) {
        Shape shape = null;
        switch (type) {
            case "CIRCLE":
                shape = new Circle();
                break;
            case "RECTANGLE":
                shape = new Rectangle();
                break;
            case "SQUARE":
                shape = new Square();
                break;
            default:
                break;
        }
        return shape;
    }

}

package com.example.factorypattern;

import com.example.factorypattern.service.impl.ShapeFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FactoryPatternApplicationTests {

    @Test
    void contextLoads() {
        ShapeFactory shapeFactory = new ShapeFactory();
        shapeFactory.factory("CIRCLE").draw();


    }

}

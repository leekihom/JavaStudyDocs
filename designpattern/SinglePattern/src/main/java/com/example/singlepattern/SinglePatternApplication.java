package com.example.singlepattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SinglePatternApplication {

    public static void main(String[] args) {
        System.out.println("创建实例:"+SingleObject.getInstance());
        System.out.println("创建实例:"+SingleObject.getInstance());

        for (int i = 0; i < 5; i++) {
            new Thread(() ->{
                System.out.println("多线程创建实例:"+SingleObject.getInstance());
            }).start();
        }
    }

}

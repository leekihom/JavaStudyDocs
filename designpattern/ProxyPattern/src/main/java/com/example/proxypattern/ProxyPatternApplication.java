package com.example.proxypattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProxyPatternApplication {

    public static void main(String[] args) {
        Image image = new ProxyImage("test.png");
        image.display();
        System.out.println(image);
        image.display();
        System.out.println(image);
    }

}

package com.lzh.templatepattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TemplatePatternApplication {

    public static void main(String[] args) {
        Game fpsgame = new FPSGame();
        fpsgame.play();
    }

}

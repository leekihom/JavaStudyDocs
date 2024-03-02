package com.example.strategypattern;

import com.example.strategypattern.service.impl.Pay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StrategyPatternApplication {


	public static void main(String[] args) {
		SpringApplication.run(StrategyPatternApplication.class, args);
	}

}

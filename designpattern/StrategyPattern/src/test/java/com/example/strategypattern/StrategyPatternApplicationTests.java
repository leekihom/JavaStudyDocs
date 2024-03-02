package com.example.strategypattern;

import com.example.strategypattern.service.impl.Pay;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StrategyPatternApplicationTests {


	@Autowired
	Pay pay;

	@Test
	void contextLoads() {
		pay.pay("jdPay",100);
		pay.pay("wechatPay",101);
		pay.pay("aliPay",102);
	}

}

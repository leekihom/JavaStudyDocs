package com.example.account.service;

import com.example.account.domain.CommonResult;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @Author leezihong
 * @Date 2023/2/15 22:44
 * @Version 1.0
 * @description TODO
 */
@Service
public interface AccountService {


    CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money")BigDecimal money);
}

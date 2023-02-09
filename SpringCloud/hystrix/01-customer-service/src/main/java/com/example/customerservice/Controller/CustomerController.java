package com.example.customerservice.Controller;

import com.example.customerservice.Feign.CustomerRentFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.soap.Addressing;

/**
 * @Author leezihong
 * @Date 2023/2/8 15:54
 * @Version 1.0
 * @description TODO
 */

@RestController
public class CustomerController {

    /**
     * 因为容器中存在了两个名字叫CustomerRentFeign的bean，所以需要指定用的是哪一个
     */
    @Qualifier("com.example.customerservice.Feign.CustomerRentFeign")
    @Autowired
    private CustomerRentFeign customerRentFeign;

    @GetMapping("customerRent")
    public String rent(){
        String string = customerRentFeign.rent();
        return string;
    }
}

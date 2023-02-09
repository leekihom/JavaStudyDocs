package com.example.carservice.Controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author leezihong
 * @Date 2023/2/8 15:52
 * @Version 1.0
 * @description TODO
 */
@RestController
public class RentCarController {

    @GetMapping("rent")
    @HystrixCommand(fallbackMethod = "CustomerHystrix",commandProperties = {
            //设置Hystrix的超时时间，默认1s
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value = "3000")
    })
    public String rent(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return  "正常调用";
    }

    public String CustomerHystrix(){
        return  "熔断调用";
    }

}

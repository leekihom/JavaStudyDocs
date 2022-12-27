package com.userservice;

import com.userservice.controller.UserController;
import com.userservice.feign.UserOrderFeign;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


@SpringBootTest
class UserServiceApplicationTests {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * feign的调用过程
     * 就是拼接http请求
     */

    @Test
    void contextLoads() {
        UserOrderFeign o = (UserOrderFeign) Proxy.newProxyInstance(UserController.class.getClassLoader()
                , new Class[]{UserOrderFeign.class}, new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //先拿到调用的方法名 doOrder
                        // name = method.getName();
                        //拿到方法的注解
                        GetMapping annotation = method.getAnnotation(GetMapping.class);
                        //拿到注解的接口请求地址
                        String[] paths = annotation.value();
                        String path = paths[0];
                        Class<?> clazz = method.getDeclaringClass();
                        FeignClient feignClient = clazz.getAnnotation(FeignClient.class);
                        String applicationName = feignClient.value();
                        String url = "http://"+applicationName+"/"+path;
                        String object = restTemplate.getForObject(url,String.class);
                        return object;
                    }
                });
        String s = o.doOrder();
        System.out.println(s);
    }

}

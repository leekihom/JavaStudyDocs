package com.example.resttemplate;

import com.example.resttemplate.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class RestTemplateApplicationTests {

    @Test
    void contextLoads() {
        //在java中请求一个页面
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://www.baidu.com";

        String result = restTemplate.getForObject(url,String.class);
        System.out.println("result:"+result);
    }
    @Test
    void testGet(){
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/testGet?name=lee";
        //String str = restTemplate.getForObject(url,String.class);

        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url,String.class);

        System.out.println(responseEntity);
    }



    @Test
    void testPost1(){
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/testPost1";
        //String str = restTemplate.getForObject(url,String.class);

        //ResponseEntity<String> responseEntity = restTemplate.getForEntity(url,String.class);
        //发送json格式的post请求，web默认使用jackson
        User user = new User("lee",22,100D);
        String result = restTemplate.postForObject(url,user,String.class);
        System.out.println(result);
    }

    @Test
    void testPost2(){
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/testPost2";
        //String str = restTemplate.getForObject(url,String.class);

        //ResponseEntity<String> responseEntity = restTemplate.getForEntity(url,String.class);
        //发送json格式的post请求，web默认使用jsckson
        MultiValueMap<String,Object> map = new LinkedMultiValueMap<>();
        map.add("name","lee");
        map.add("age",22);
        map.add("price",2000D);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        //需要加上头部才行
        //HttpEntity<MultiValueMap<String, Object>> request = new HttpEntity<>(map, headers);
        String result = restTemplate.postForObject(url,map ,String.class);
        System.out.println(result);
    }
}

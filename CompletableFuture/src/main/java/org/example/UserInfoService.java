package org.example;

/**
 * @Author leezihong
 * @Date 2023/12/14 23:02
 * @Version 1.0
 * @description TODO
 */
public class UserInfoService {

    public UserInfo getUserInfo() {
        //模拟操作耗时
        try {
            Thread.sleep(300);
            return new UserInfo("tim",12,null);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String getUserAddress() {
        try {
            // 模拟操作耗时
            Thread.sleep(500);
            return "黄山大道";
        } catch (InterruptedException e) {
            // 如果发生中断异常，将其包装为RuntimeException
            throw new RuntimeException(e);
        }
    }

}

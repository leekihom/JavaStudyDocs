package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author leezihong
 * @Date 2023/12/14 23:03
 * @Version 1.0
 * @description TODO
 */
@Data
@AllArgsConstructor
public class UserInfo {
    private String username;
    private Integer age;

    private String address;
}

package com.example.springsecurity.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springsecurity.domain.Menu;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author leezihong
 * @Date 2022/12/19 18:04
 * @Version 1.0
 * @description TODO
 */
@Repository
public interface MenuMapper extends BaseMapper<Menu> {

    List<String> selectPermsByUserId(long userId);

}
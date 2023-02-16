package com.example.account.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.account.domain.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @Author leezihong
 * @Date 2023/2/15 18:37
 * @Version 1.0
 * @description TODO
 */
@Mapper
public interface AccountMapper extends BaseMapper<Account> {

    void decrease(@Param("userId") Long userId,@Param("money") BigDecimal money);

}

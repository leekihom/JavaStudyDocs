package com.example.storage.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.storage.domain.Storage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author leezihong
 * @Date 2023/2/15 18:37
 * @Version 1.0
 * @description TODO
 */
@Mapper
public interface StorageMapper extends BaseMapper<Storage> {

    void decrease(@Param("productId") Long productId,@Param("count") Integer count);

}

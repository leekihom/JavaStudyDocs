package com.example.storage.service.impl;

import com.example.storage.mapper.StorageMapper;
import com.example.storage.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author leezihong
 * @Date 2023/2/15 23:57
 * @Version 1.0
 * @description TODO
 */
@Service
public class StorageServiceImpl implements StorageService {

    @Autowired
    private StorageMapper storageMapper;
    @Override
    public void decrease(Integer count, Long productId) {
        storageMapper.decrease(productId,count);
    }
}

package com.ganxy.storage.service;

import com.ganxy.storage.mapper.StorageMapper;
import com.ganxy.storage.pojo.Storage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Transactional
@Service
public class StorageService {

    @Autowired
    private StorageMapper storageMapper;

    public int addStorage() {
        Storage storage = new Storage();
        String storageId = UUID.randomUUID().toString().replaceAll("-", "");
        storage.setStorageId(storageId);
        storage.setStuffName("仓库1");
        storage.setStorageQuantity(11);
        int result = storageMapper.insertSelective(storage);
        return result;
    }


}

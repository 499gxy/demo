package com.ganxy.storage.mapper;


import com.ganxy.storage.mymapper.MyMapper;
import com.ganxy.storage.pojo.Storage;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface StorageMapper extends MyMapper<Storage> {
}

package com.myself.demo.mapper;

import com.myself.demo.model.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserMapper {
   User selectUser (String id);
   int deleteUser (String id);
   int addUser (User user);
   int updateUser (User user);
}

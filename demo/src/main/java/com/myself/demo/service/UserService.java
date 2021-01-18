package com.myself.demo.service;

import com.myself.demo.mapper.UserMapper;
import com.myself.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User selectUser(String id){
       return userMapper.selectUser(id);
    }

    public int deleteUser(String id){
        return  userMapper.deleteUser(id);
    }

    public int addUser(User user){
       return userMapper.addUser(user);
    }

    public int updateUser(User user){
        return userMapper.updateUser(user);
    }
}

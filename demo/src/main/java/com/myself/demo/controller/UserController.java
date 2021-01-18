package com.myself.demo.controller;

import com.myself.demo.model.User;
import com.myself.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/getUserList")
    public User selectUser(@RequestParam String id){
       return userService.selectUser(id);

    }

    @PostMapping("/deleteUser")
    public int deleteUser(String id){
       return userService.deleteUser(id);
    }

    @PostMapping("/updateUser")
    public int updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @PostMapping("/addUser")
    public int addUser(User user){
        return userService.addUser(user);
    }
}

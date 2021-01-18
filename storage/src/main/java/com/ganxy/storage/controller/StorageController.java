package com.ganxy.storage.controller;

import com.ganxy.storage.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StorageController {

    @Autowired
    private StorageService storageService;


    @PostMapping("/addStorage")
    public String addStorage(){
        int result = storageService.addStorage();
        if(result!=0){
            return "成功";
        }else{ return "失败";}
    }
}












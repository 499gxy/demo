package com.ganxy.order.controller;

import com.ganxy.order.dto.AddOrderDTO;
import com.ganxy.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/addOrder")
    public String addOrder(@RequestBody AddOrderDTO addOrderDTO){
        int result = orderService.addOrder(addOrderDTO);
        if(result!=0){
            return "成功";
        }else{
            return "失败";
        }
    }
}

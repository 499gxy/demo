package com.ganxy.order.service;

import com.ganxy.order.dto.AddOrderDTO;
import com.ganxy.order.mapper.OrderMapper;
import com.ganxy.order.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Transactional
@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;


    public int addOrder(AddOrderDTO addOrderDTO) {

        String orderId = UUID.randomUUID().toString().replaceAll("-", "");
        Order order = new Order();

        order.setOrderId(orderId);
        order.setUserId(2);
        order.setQuantity(addOrderDTO.getQuantity());
        order.setStorageId(addOrderDTO.getStorageId());
        int result = orderMapper.insertSelective(order);
        return result;
    }
}

package com.ganxy.order.mapper;

import com.ganxy.order.mymapper.MyMapper;
import com.ganxy.order.pojo.Order;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface OrderMapper<T>   extends MyMapper<Order> {
}

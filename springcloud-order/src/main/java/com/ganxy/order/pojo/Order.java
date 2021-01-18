package com.ganxy.order.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Table(name = "order")
public class Order implements Serializable {

    @Id
    @Column(name = "ORDER_ID")
    private String orderId;

    @Column(name = "USER_ID")
    private Integer userId;

    @Column(name = "QUANTITY")
    private Integer quantity;

    @Column(name = "STORAGE_ID")
    private String storageId;
}

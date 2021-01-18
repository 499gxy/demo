package com.ganxy.order.dto;

import lombok.Data;

import javax.persistence.Column;

@Data
public class AddOrderDTO {

    @Column(name = "id")
    private int id;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "storageId")
    private String storageId;
}

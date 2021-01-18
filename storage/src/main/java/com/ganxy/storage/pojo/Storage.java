package com.ganxy.storage.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "storage")
public class Storage {

    @Id
    @Column(name = "SORAGE_ID")
    private String storageId;

    @Column(name = "STUFF_NAME")
    private String stuffName;

    @Column(name = "STORAGE_QUANTITY")
    private Integer storageQuantity;


}





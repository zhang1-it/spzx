package com.atguigu.spzx.cloud.model.entity;

import lombok.Data;

import java.math.BigDecimal;

// com.atguigu.spzx.cloud.order.entity
@Data
public class Order {

    private Long id ;
    private Long userid ;
    private String name ;
    private BigDecimal price ;
    private Integer num ;
    private User user;
    
}
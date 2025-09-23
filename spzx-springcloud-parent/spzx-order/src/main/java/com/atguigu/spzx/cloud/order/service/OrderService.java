package com.atguigu.spzx.cloud.order.service;


import com.atguigu.spzx.cloud.model.entity.Order;

// com.atguigu.spzx.cloud.order.service
public interface OrderService {

    // 根据订单的id查询订单数据
    public abstract Order findOrderByOrderId(Long orderId) ;

}


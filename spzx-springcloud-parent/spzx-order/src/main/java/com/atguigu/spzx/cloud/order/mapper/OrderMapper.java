package com.atguigu.spzx.cloud.order.mapper;

import com.atguigu.spzx.cloud.model.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

// com.atguigu.spzx.cloud.order.mapper;
@Mapper  // 该注解可以通过在启动类上的@MapperScan注解进行替换
public interface OrderMapper {

    // 根据订单的id查询订单数据
    public abstract Order findOrderByOrderId(@Param("orderId") Long orderId) ;

}
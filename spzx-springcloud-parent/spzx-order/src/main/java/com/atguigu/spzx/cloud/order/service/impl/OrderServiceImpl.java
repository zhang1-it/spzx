package com.atguigu.spzx.cloud.order.service.impl;


import com.atguigu.spzx.cloud.feign.api.UserFeignClient;
import com.atguigu.spzx.cloud.model.entity.Order;
import com.atguigu.spzx.cloud.model.entity.User;
import com.atguigu.spzx.cloud.order.mapper.OrderMapper;
import com.atguigu.spzx.cloud.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

// com.atguigu.spzx.cloud.order.service.impl;
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper ;
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserFeignClient userFeignClient;;

    @Override
    public Order findOrderByOrderId(Long orderId) {
        Order order = orderMapper.findOrderByOrderId(orderId);
//        User user = restTemplate.getForObject("http://spzx-cloud-user/api/user/findUserByUserId/" + order.getUserid(), User.class);
        User user = userFeignClient.queryById(order.getUserid());
        order.setUser(user);
        return order;
    }

}
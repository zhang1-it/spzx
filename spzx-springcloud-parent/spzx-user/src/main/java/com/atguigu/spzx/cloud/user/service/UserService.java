package com.atguigu.spzx.cloud.user.service;


import com.atguigu.spzx.cloud.model.entity.User;

public interface UserService {

    // 根据用户的id查询用户详情
    public abstract User findUserByUserId(Long userId) ;

}

// com.atguigu.spzx.cloud.user.service.impl;

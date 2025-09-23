package com.atguigu.spzx.cloud.user.service.impl;

import com.atguigu.spzx.cloud.model.entity.User;
import com.atguigu.spzx.cloud.user.mapper.UserMapper;
import com.atguigu.spzx.cloud.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper ;

    @Override
    public User findUserByUserId(Long userId) {
        return userMapper.findUserByUserId(userId);
    }

}
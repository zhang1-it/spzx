package com.atguigu.spzx.cloud.user.mapper;

import com.atguigu.spzx.cloud.model.entity.User;
import org.apache.ibatis.annotations.Mapper;

// com.atguigu.spzx.cloud.user.mapper;
@Mapper  // 该注解可以通过在启动类上的@MapperScan注解进行替换
public interface UserMapper {

    // 根据用户的id查询用户详情
    public abstract User findUserByUserId(Long userId) ;

}
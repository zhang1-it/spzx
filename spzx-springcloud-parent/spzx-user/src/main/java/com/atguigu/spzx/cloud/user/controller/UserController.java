package com.atguigu.spzx.cloud.user.controller;

import com.atguigu.spzx.cloud.model.entity.User;
import com.atguigu.spzx.cloud.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// com.atguigu.spzx.cloud.user.controller
@RestController
@RequestMapping(value = "/api/user")
@RefreshScope // 动态刷新配置
public class UserController {

    @Autowired
    private UserService userService ;

    @GetMapping(value = "/findUserByUserId/{userId}")
    public User findUserByUserId(@PathVariable(value = "userId") Long userId) {
        return userService.findUserByUserId(userId) ;
    }

    @Value("${password}")
    String password;
    @GetMapping("/getpassword")
    public String getpassword() {
        return password ;
    }
}
package com.atguigu.spzx.cloud.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

// com.atguigu.spzx.cloud.order
@SpringBootApplication
@EnableFeignClients(basePackages = {
        "com.atguigu.spzx.cloud.feign.api"
})
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class , args) ;
    }

}
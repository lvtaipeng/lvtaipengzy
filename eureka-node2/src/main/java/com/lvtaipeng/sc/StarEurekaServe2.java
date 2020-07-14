package com.lvtaipeng.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class StarEurekaServe2 {
    public static void main(String[] args) {
        System.out.println("注册中心22222启动了");
        SpringApplication.run(StarEurekaServe2.class);
    }
}

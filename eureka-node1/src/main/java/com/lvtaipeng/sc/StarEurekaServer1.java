package com.lvtaipeng.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class StarEurekaServer1 {
    public static void main(String[] args) {
        System.out.println("注册中心111启动了");
        SpringApplication.run(StarEurekaServer1.class);
    }
}

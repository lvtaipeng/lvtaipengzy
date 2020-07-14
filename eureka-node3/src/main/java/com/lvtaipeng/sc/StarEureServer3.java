package com.lvtaipeng.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

    @SpringBootApplication
    @EnableEurekaServer
    public class StarEureServer3 {
        public static void main(String[] args) {
            System.out.println("注册中心33333启动了");
            SpringApplication.run(StarEureServer3.class);
        }
    }



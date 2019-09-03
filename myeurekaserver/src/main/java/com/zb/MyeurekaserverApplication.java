package com.zb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MyeurekaserverApplication {
    public static void main(String[] args) {
        //asasd
        SpringApplication.run(MyeurekaserverApplication.class,args);
    }
}

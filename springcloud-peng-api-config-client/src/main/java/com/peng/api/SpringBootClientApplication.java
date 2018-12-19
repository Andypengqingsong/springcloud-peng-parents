package com.peng.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringBootClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootClientApplication.class, args);
    }

}
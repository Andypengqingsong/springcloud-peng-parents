package com.peng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;

/**
 * Hello world!
 */

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class SpringcloudZuulApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudZuulApp.class, args);
    }

    @RefreshScope
    @ConfigurationProperties("zuul")
    public ZuulProperties ZuulProperties() {
        return new ZuulProperties();
    }
}

package com.ywh.cloud.alibaba.example.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.EnableLoadTimeWeaving;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class CloudAlibabaExampleGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaExampleGatewayApplication.class, args);
    }

}

package com.ywh.cloud.alibaba.example.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudAlibabaExampleConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaExampleConsumerApplication.class, args);
    }

}

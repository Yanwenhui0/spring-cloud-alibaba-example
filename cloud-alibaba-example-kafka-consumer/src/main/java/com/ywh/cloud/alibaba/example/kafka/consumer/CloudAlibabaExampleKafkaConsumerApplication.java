package com.ywh.cloud.alibaba.example.kafka.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.messaging.Source;

@SpringBootApplication
public class CloudAlibabaExampleKafkaConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaExampleKafkaConsumerApplication.class, args);
    }

}

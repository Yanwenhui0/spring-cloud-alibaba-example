package com.ywh.cloud.alibaba.example.rocketmq.provider;

import com.ywh.cloud.alibaba.example.rocketmq.provider.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;

@SpringBootApplication
@EnableBinding({Source.class})
public class CloudAlibabaExampleRocketmqProviderApplication implements CommandLineRunner {

    @Autowired
    private ProviderService providerService;

    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaExampleRocketmqProviderApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("===========================================");
        providerService.send("hello! rocketmq!");
    }
}

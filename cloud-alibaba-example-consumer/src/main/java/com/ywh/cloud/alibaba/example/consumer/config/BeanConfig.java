package com.ywh.cloud.alibaba.example.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author : yanwenhui
 * @description :
 * @date : 2020/8/17
 */
@Configuration
public class BeanConfig {

    @Bean
    public RestTemplate restTemplate(){

        return new RestTemplate();
    }
}

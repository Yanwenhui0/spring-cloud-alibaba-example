package com.ywh.cloud.alibaba.example.kafka.consumer.service;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

/**
 * @author : yanwenhui
 * @description :
 * @date : 2020/9/4
 */
@Service
public class ConsumerReceive {

    @StreamListener("input")
    public void receiveInput(String message) {
        System.out.println("Receive input: " + message);
    }
}

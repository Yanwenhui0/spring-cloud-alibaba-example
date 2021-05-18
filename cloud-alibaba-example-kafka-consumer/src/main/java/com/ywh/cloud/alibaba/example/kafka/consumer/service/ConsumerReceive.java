package com.ywh.cloud.alibaba.example.kafka.consumer.service;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Service;

/**
 * @author : yanwenhui
 * @description :
 * @date : 2020/9/4
 */
@Service
/**
 * 消息接受端，stream给我们提供了Sink,Sink源码里面是绑定input的，要跟我们配置文件的imput关联的
 */
@EnableBinding({Sink.class})
public class ConsumerReceive {

    @StreamListener(Sink.INPUT)
    public void receiveInput(String message) {
        System.out.println("Receive input: " + message);
    }
}

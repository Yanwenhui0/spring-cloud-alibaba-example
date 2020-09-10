package com.ywh.cloudalibabaexamplekafkaprovider.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

/**
 * @author : yanwenhui
 * @description :
 * @date : 2020/9/4
 */
@Service
public class KafkaProviderService {

    @Autowired
    private MessageChannel output;

    public void send(String message) {
        output.send(MessageBuilder.withPayload(message).build());
    }

}

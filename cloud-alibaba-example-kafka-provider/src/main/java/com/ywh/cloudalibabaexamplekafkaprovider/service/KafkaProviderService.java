package com.ywh.cloudalibabaexamplekafkaprovider.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

/**
 * @author : yanwenhui
 * @description :
 * @date : 2020/9/4
 */
@Service
/**
 * 这个注解给我们绑定消息通道的，Source是Stream给我们提供的，可以点进去看源码，可以看到output和input,这和配置文件中的output，input对应的。
 */
@EnableBinding({Source.class})
public class KafkaProviderService {

    @Autowired
    MessageChannel output;

    public void send(String message) {
        output.send(MessageBuilder.withPayload(message).build());
    }

}

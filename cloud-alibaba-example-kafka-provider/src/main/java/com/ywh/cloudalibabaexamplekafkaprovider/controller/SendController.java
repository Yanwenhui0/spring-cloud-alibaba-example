package com.ywh.cloudalibabaexamplekafkaprovider.controller;

import com.ywh.cloudalibabaexamplekafkaprovider.service.KafkaProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : yanwenhui
 * @description :
 * @date : 2020/9/9
 */
@RestController
@RequestMapping("/send")
public class SendController {

    @Autowired
    private KafkaProviderService kafkaProviderService;

    @GetMapping({"", "/"})
    public String sendMessage() {
        System.out.println("===========================================");
        kafkaProviderService.send("hello! rocketmq!");
        return "send OK!!!";
    }

    @GetMapping("/one")
    public String sendOne() {
        System.out.println("===========================================");
        return "send ONE!!!";
    }

}

package com.ywh.cloud.alibaba.example.rocketmq.provider.controller;

import com.ywh.cloud.alibaba.example.rocketmq.provider.service.ProviderService;
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
    private ProviderService providerService;

    @GetMapping({"", "/"})
    public String sendMessage() {
        System.out.println("===========================================");
        providerService.send("hello! rocketmq!");
        return "send OK!!!";
    }

    @GetMapping("/one")
    public String sendOne() {
        System.out.println("===========================================");
        return "send ONE!!!";
    }

}

package com.ywh.cloud.alibaba.example.consumer.controller;

import com.ywh.cloud.alibaba.example.consumer.service.OneConsumerFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : yanwenhui
 * @description :
 * @date : 2020/8/17
 */
@RestController
@RequestMapping("/one")
public class OneConsumerController {

    @Autowired
    OneConsumerFeignService oneConsumerFeignService;

    @GetMapping
    public String getOne() {
        return oneConsumerFeignService.getOne("example-consumer-feign");
    }

}

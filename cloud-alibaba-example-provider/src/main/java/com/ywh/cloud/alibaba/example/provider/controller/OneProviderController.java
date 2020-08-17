package com.ywh.cloud.alibaba.example.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : yanwenhui
 * @description :
 * @date : 2020/8/17
 */
@RestController
@RequestMapping("/one")
public class OneProviderController {

    @Value("${server.port}")
    private String serverName;

    @Value("${spring.application.name}")
    private String serverPort;

    @GetMapping("/{from}")
    public String getOne(@PathVariable String from){
        return String.format("Hello world one example for nacos from [ %s ]. \n name :: %s \n port :: %s", from, serverName, serverPort);
    }

}

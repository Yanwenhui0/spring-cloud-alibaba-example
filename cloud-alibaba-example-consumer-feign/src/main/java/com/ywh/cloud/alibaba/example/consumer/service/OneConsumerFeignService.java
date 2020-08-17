package com.ywh.cloud.alibaba.example.consumer.service;

import com.ywh.cloud.alibaba.example.consumer.service.fallback.OneConsumerFeignFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author : yanwenhui
 * @description :
 * @date : 2020/8/17
 */
@FeignClient(value = "example-provider", path = "/example-provider/one", fallback = OneConsumerFeignFallback.class)
public interface OneConsumerFeignService {

    @GetMapping("/{from}")
    String getOne(@PathVariable String from);

}

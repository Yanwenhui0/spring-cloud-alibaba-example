package com.ywh.cloud.alibaba.example.consumer.service.fallback;

import com.ywh.cloud.alibaba.example.consumer.service.OneConsumerFeignService;
import org.springframework.stereotype.Service;

/**
 * @author : yanwenhui
 * @description :
 * @date : 2020/8/17
 */
@Service
public class OneConsumerFeignFallback implements OneConsumerFeignService {



    @Override
    public String getOne(String from) {
        return String.format("服务器开小差，请稍后重试！(from [ %s ])", from);
    }
}

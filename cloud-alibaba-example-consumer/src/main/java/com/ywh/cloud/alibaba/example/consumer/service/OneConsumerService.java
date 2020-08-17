package com.ywh.cloud.alibaba.example.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author : yanwenhui
 * @description :
 * @date : 2020/8/17
 */
@Service
public class OneConsumerService {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate restTemplate;

    public String getProviderOne() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("example-provider");
        String path = String.format("http://%s:%s/example-provider/one/example-consumer", serviceInstance.getHost(), serviceInstance.getPort());
        System.out.println("request path:" + path);
        return restTemplate.getForObject(path, String.class);
    }
}

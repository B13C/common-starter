package com.geoxus.service.impl;

import com.geoxus.service.SendRequestToCloudService;
import org.springframework.stereotype.Service;

@Service
public class SendRequestToCloudServiceImpl implements SendRequestToCloudService {
    @Override
    public String sayHello(String str) {
        System.out.println("我是资源收集器");
        return "枫叶思源 : " + str;
    }
}

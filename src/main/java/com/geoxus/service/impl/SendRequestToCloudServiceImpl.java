package com.geoxus.service.impl;

import com.geoxus.service.SendRequestToCloudService;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SendRequestToCloudServiceImpl implements SendRequestToCloudService {
    @Resource
    private ApplicationContext applicationContext;

    @Override
    public String sayHello(String str) {
        String applicationName = applicationContext.getApplicationName();
        System.out.println("我是资源收集器");
        return "枫叶思源 : " + str + " : " + applicationName;
    }
}

package com.geoxus.listeners;

import com.geoxus.event.CommonEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;

import javax.annotation.Resource;

// 如果使用的是原生的Spring Cloud 则 @Component @Bean都可以
// @Component
public class CommonListener implements ApplicationListener<CommonEvent> {
    @Resource
    private ApplicationContext applicationContext;

    @Override
    public void onApplicationEvent(CommonEvent commonEvent) {
        System.out.println("CommonEvent的监听器被执行");
    }
}

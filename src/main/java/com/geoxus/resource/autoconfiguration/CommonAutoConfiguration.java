package com.geoxus.resource.autoconfiguration;

import com.geoxus.resource.autoconfiguration.annotations.CommonAnnotation;
import com.geoxus.resource.autoconfiguration.annotations.CommonResourceAnnotation;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.AnnotationUtils;

import javax.annotation.Resource;
import java.lang.reflect.Method;
import java.util.Map;

@Configuration
@EnableConfigurationProperties(CommonProperties.class)
public class CommonAutoConfiguration {
    @Resource
    private ApplicationContext applicationContext;

    @Bean
    @ConditionalOnBean(name = "sendRequestToCloudService")
    public void init() {
        Map<String, Object> beansWithAnnotation = applicationContext.getBeansWithAnnotation(CommonAnnotation.class);
        for (String key : beansWithAnnotation.keySet()) {
            Class<?> aClass = beansWithAnnotation.get(key).getClass();
            // 获取指定bean的注解为ProductServiceAnnotation.class的注解属性
            CommonAnnotation serviceAnnotation =
                    AnnotationUtils.findAnnotation(aClass, CommonAnnotation.class);
            System.out.println(serviceAnnotation);
            Method[] declaredMethods = aClass.getDeclaredMethods();
            for (Method method : declaredMethods) {
                CommonResourceAnnotation annotation = method.getAnnotation(CommonResourceAnnotation.class);
                System.out.println(annotation);
            }
        }
    }
}

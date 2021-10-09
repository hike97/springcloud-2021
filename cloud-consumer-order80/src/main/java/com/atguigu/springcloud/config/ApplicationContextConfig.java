package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName ApplicationConfig
 * @Description TODO
 * @Author hike97
 * @Date 2021/1/26 16:02
 * @Version 1.0
 **/
@Configuration
public class ApplicationContextConfig {

    /**
     * rest访问需要负载均衡注解
     */
    @Bean
//    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}

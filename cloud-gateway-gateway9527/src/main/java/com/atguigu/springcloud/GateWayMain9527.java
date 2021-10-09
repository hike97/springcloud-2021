package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName GateWayMain9527
 * @Description TODO
 * @Author hike97
 * @Date 2021/10/9 9:51
 * @Version 1.0
 **/


@SpringBootApplication
@EnableEurekaClient
public class GateWayMain9527 {
    public static void main (String[] args) {
        SpringApplication.run (GateWayMain9527.class, args);
    }
}

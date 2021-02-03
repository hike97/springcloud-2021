package com.atguigu.springcloud.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author hike97 2month
 * @create 2021-01-25 0:00
 * @desc zookeeper 消费者类
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZKMain80 {
	public static void main (String[] args) {
		SpringApplication.run(OrderZKMain80.class,args);
	}
}

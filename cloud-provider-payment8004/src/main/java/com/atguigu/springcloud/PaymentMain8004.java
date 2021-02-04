package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author hike97 2month
 * @create 2021-01-25 0:00
 * @desc 订单服务主启动类8001
 **/
//zookeeper consol 可以识别
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8004 {
	public static void main (String[] args) {
		SpringApplication.run(PaymentMain8004.class,args);
	}
}

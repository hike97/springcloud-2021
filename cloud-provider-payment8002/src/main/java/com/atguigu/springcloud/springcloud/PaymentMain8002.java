package com.atguigu.springcloud.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author hike97 2month
 * @create 2021-01-25 0:00
 * @desc 订单服务主启动类8001
 **/
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8002 {
	public static void main (String[] args) {
		SpringApplication.run(PaymentMain8002.class,args);
	}
}

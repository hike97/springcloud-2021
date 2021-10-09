package com.atguigu.springcloud;

import com.atguigu.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author hike97 2month
 * @create 2021-01-25 0:00
 * @desc 订单服务主启动类8001
 **/
@SpringBootApplication
@EnableEurekaClient
//启用自己定制的 包不要在能扫描的包下随机的策略
//@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = MySelfRule.class)
public class OrderMain80 {
	public static void main (String[] args) {
		SpringApplication.run(OrderMain80.class,args);
	}
}

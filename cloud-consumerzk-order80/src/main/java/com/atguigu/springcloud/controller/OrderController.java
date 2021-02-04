package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author hike97 2month
 * @create 2021-01-25 1:17
 * @desc
 **/
@RestController
@Slf4j
@RequestMapping("/consumer")
public class OrderController {
    //    public static final String PAYMENT_URL = "http://localhost:8001";
    public static final String INVOME_URL = "http://cloud-provider-payment";
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/payment/zk")
    public String payment() {
        String result = restTemplate.getForObject(INVOME_URL + "/payment/zk", String.class);
        return result;
    }
//
}
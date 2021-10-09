package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @ClassName PaymentHystrixFallback
 * @Description TODO
 * @Author hike97
 * @Date 2021/2/4 14:41
 * @Version 1.0
 **/
@Component
public class PaymentHystrixFallback implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "PaymentHystrixService paymentInfo_OK --------------fall back ,/(ㄒoㄒ)/~~";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "PaymentHystrixService paymentInfo_TimeOut --------------fall back, /(ㄒoㄒ)/~~";
    }
}

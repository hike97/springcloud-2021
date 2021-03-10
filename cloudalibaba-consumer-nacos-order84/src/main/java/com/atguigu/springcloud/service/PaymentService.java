package com.atguigu.springcloud.service;

import com.atguigu.springcloud.dto.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.fallback.PaymentFallbackService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName PaymentService
 * @Description TODO
 * @Author hike97
 * @Date 2021/3/10 16:17
 * @Version 1.0
 **/
@FeignClient(value = "nacos-payment-provider", fallback = PaymentFallbackService.class)
public interface PaymentService {
    @GetMapping(value = "/paymentSQL/{id}")
    CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);
}

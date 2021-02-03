package com.atguigu.springcloud.springcloud.service;

import com.atguigu.springcloud.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author hike97
 * @create 2021-01-25 1:14
 * @desc 服务类
 **/
public interface PaymentService {

	int create(Payment payment);

	Payment getPaymentById(@Param ("id") Long id);
}

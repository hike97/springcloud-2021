package com.atguigu.springcloud.springcloud.dao;

import com.atguigu.springcloud.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author hike97 2month
 * @create 2021-01-25 0:53
 * @desc 接口
 **/
@Mapper
public interface PaymentDao {

	int create(Payment payment);

	Payment getPaymentById(@Param ("id") Long id);
}

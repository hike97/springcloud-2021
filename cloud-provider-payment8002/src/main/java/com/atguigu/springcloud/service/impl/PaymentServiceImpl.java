package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author hike97 2month
 * @create 2021-01-25 1:15
 * @desc
 **/
@Service
public class PaymentServiceImpl implements PaymentService {
	@Autowired
    PaymentDao paymentDao;

	@Override
	public int create (Payment payment) {
		return paymentDao.create (payment);
	}

	@Override
	public Payment getPaymentById (Long id) {
		return paymentDao.getPaymentById (id);
	}
}

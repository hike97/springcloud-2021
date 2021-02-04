package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.dto.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;

/**
 * @author hike97 2month
 * @create 2021-01-25 1:17
 * @desc
 **/
@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {
	@Autowired
    PaymentService paymentService;

	@Value("${server.port}")
	private String serverPort;

	/**
	 * 插入订单操作
	 * @param payment
	 * @return
	 */
	@PostMapping("/create")
	public CommonResult create(@RequestBody Payment payment){
		int result = paymentService.create (payment);
		if (result>0){
			return new CommonResult (200,serverPort+": insert success");
		}else {
			return new CommonResult (444,"insert fail");
		}
	}

	@GetMapping ("/get/{id}")
	public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
		Payment payment = paymentService.getPaymentById (id);
		log.info("test dev tools ~   dasdasdasdas");
		if (payment !=null){
			return new CommonResult (200,serverPort+": select success",payment);
		}else {
			return new CommonResult (444,"select fail");
		}
	}

	@GetMapping(value = "/lb")
	public String getPaymentLB() {
		return serverPort;
	}

	@GetMapping(value = "/feign/timeout")
	public String paymentFeignTimeout() {
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return serverPort;
	}
}

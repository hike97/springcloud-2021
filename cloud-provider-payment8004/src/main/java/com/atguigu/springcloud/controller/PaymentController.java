package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author hike97 2month
 * @create 2021-01-25 1:17
 * @desc
 **/
@RestController
@Slf4j
@RequestMapping ("payment")
public class PaymentController {

	@Value ("${server.port}")
	private String serverPort;

	@GetMapping (value = "/zk")
	public String paymentzk () {
		return "springcloud with zookeeper:" + serverPort + "\t" + UUID.randomUUID ().toString ();
	}

}

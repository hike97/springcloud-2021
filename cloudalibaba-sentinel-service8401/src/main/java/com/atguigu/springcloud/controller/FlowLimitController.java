package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.jni.Time;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName A
 * @Description TODO
 * @Author hike97
 * @Date 2021/3/1 15:08
 * @Version 1.0
 **/
@RestController
@Slf4j
public class FlowLimitController {
    @GetMapping("/testA")
    public String testA() {
        return "------testA";
    }

    @GetMapping("/testB")
    public String testB() throws InterruptedException {
        System.out.println(Thread.currentThread().getName()+"testB =============================================================");
        TimeUnit.SECONDS.sleep(2);
        return "------testB";
    }
}

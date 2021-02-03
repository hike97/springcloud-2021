package com.atguigu.springcloud.springcloud.lb;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName MyLB
 * @Description TODO
 * @Author hike97
 * @Date 2021/2/2 14:19
 * @Version 1.0
 **/
@Component
@Slf4j
public class MyLB implements LoadBalancer{
    /**
     *  初始化访问次数
     */
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public final int getAndIncreasement(){
        int current;
        int next;
        for (;;) {
              current = atomicInteger.get();
              next = current>=Integer.MAX_VALUE?0:current+1;
            if (atomicInteger.compareAndSet(current, next)){
                log.info("第{}次访问",next);
                return next;
            }
        }
    }
    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
        int index = getAndIncreasement()%serviceInstances.size();
        return serviceInstances.get(index);
    }
}

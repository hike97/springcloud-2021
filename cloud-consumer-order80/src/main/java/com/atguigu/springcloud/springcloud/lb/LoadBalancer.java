package com.atguigu.springcloud.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @ClassName LoadBalancer
 * @Description TODO
 * @Author hike97
 * @Date 2021/2/2 14:15
 * @Version 1.0
 **/
public interface LoadBalancer {
    /**
     * 获取服务实例
     * @param serviceInstances
     * @return
     */
    ServiceInstance instances (List<ServiceInstance> serviceInstances);
}

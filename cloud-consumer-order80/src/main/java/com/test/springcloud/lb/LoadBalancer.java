package com.test.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

public interface LoadBalancer {

    /**
     * 初始化容器
     * @param serviceInstances
     * @return
     */
    ServiceInstance instance(List<ServiceInstance> serviceInstances);
}

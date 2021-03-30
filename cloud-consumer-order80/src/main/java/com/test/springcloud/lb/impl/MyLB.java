package com.test.springcloud.lb.impl;

import com.test.springcloud.lb.LoadBalancer;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Company： NanJing xinwang Technology Co.,Ltd
 * Copyright: 2019 Copyright(C). All rights Reserved
 *
 * @Title: com.test.lb.impl.MyLB
 * @Description:
 * @author: ZhangZiWen
 * @CreateDate: 2021/3/17 15:45
 * <p>
 * Modification  History:
 * Date              Author     Discription
 * 2021/3/17 15:45   ZhangZiWen    Create File.
 */
@Component
public class MyLB implements LoadBalancer {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public final int getAndIncrement(){
        int current;
        int next;
        //自旋锁，用compareAndSet比较修改 current（期望值）和next（更新值），相等为true取反跳出循环，否则自旋
        do{
            current = this.atomicInteger.get();
            next = current >= 2147483647 ? 0: current + 1;
        }while (!this.atomicInteger.compareAndSet(current,next));
        System.out.println("*********访问次数，next：" + next);
        return next;
    }

    @Override
    public ServiceInstance instance(List<ServiceInstance> serviceInstances) {
        int index = getAndIncrement() % serviceInstances.size();
        return serviceInstances.get(index);
    }
}

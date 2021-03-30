package com.test.springcloud.service.impl;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.test.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * Company： NanJing xinwang Technology Co.,Ltd
 * Copyright: 2019 Copyright(C). All rights Reserved
 *
 * @Title: com.test.springcloud.service.impl.PaymentServiceImpl
 * @Description:
 * @author: ZhangZiWen
 * @CreateDate: 2021/3/18 11:35
 * <p>
 * Modification  History:
 * Date              Author     Discription
 * 2021/3/18 11:35   ZhangZiWen    Create File.
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Override
    public String paymentInfo_ok(Integer id) {
        return "线程池" + Thread.currentThread().getName() + " paymentInfo_ok,id" + id + "\t" + "O(∩_∩)O哈哈~";
    }

    @Override
    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000")
    })
    public String paymentInfo_Timeout(Integer id) {

        int timeout = 5;
        try {
            TimeUnit.SECONDS.sleep(timeout);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        return "线程池" + Thread.currentThread().getName() + " paymentInfo_Timeout,id" + id + "\t" + "O(∩_∩)O哈哈~" + "耗时"+ timeout +"秒钟";
    }


    public String paymentInfo_TimeOutHandler(Integer id){
        return "线程池" + Thread.currentThread().getName() + " 系统繁忙，请稍后重试！" + id + "\t" + "o(╥﹏╥)o";

    }

    /**
     * 以下为服务熔断示例
     *
     */

    @Override
    @HystrixCommand(fallbackMethod = "paymentCricuitBreaker_fallback",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enable", value = "true"),//是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolunmThreshold",value = "10"),//请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),//时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60")//失败率达到多少后跳闸
    })
    public String paymentCricuitBreaker(Integer id) {
        if(id < 0){
            throw new RuntimeException("*********id不能为负数！");
        }
        String serialNumber = IdUtil.simpleUUID();

        return Thread.currentThread().getName() + "\t" + "调用成功，流水号：" + serialNumber;
    }

    public String paymentCricuitBreaker_fallback(Integer id){
        return "id 不能为负数，请稍后重试！o(╥﹏╥)o id：" + id;
    }

}

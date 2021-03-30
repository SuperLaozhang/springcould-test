package com.test.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.test.springcloud.service.PaymentHystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Company： NanJing xinwang Technology Co.,Ltd
 * Copyright: 2019 Copyright(C). All rights Reserved
 *
 * @Title: com.test.springcloud.controller.OrderHystrixController
 * @Description:
 * @author: ZhangZiWen
 * @CreateDate: 2021/3/18 14:06
 * <p>
 * Modification  History:
 * Date              Author     Discription
 * 2021/3/18 14:06   ZhangZiWen    Create File.
 */
@RestController
@Slf4j
@DefaultProperties(defaultFallback = "payment_Globle_FallbackMethod")
public class OrderHystrixController {


    @Autowired
    private PaymentHystrixService paymentHystrixService;

    @GetMapping(value = "/consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_ok(@PathVariable("id") Integer id){
        String result = paymentHystrixService.paymentInfo_ok(id);
        return result;
    }

    /**
     * HystrixProperty注解标识，调用服务提供方值最多等待1.5秒，超时则调用fallbackMethod兜底的方法
     * @param id
     * @return
     */
    @GetMapping(value = "/consumer/payment/hystrix/timeout/{id}")
//    @HystrixCommand(fallbackMethod = "paymentTimeOutFallbackMethod",commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "1500")
//    })
    @HystrixCommand
    public String paymentInfo_Timeout(@PathVariable("id") Integer id){
        String result = paymentHystrixService.paymentInfo_Timeout(id);
        return result;
    }

    public String paymentTimeOutFallbackMethod(Integer id){
        return "我是消费者80，请十秒后再试！";
    }

    /**
     * 全局服务降级兜底方法
     * @return
     */
    public String payment_Globle_FallbackMethod(){
        return "全局服务降级兜底方法";
    }
}

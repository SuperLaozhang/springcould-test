package com.test.springcloud.service;

import com.test.springcloud.entities.ConmonResult;
import com.test.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
//使用feign组件调用的方法,value标识需要找的微服务名称
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @GetMapping(value = "/payment/getPaymentById/{id}")
    public ConmonResult<Payment> getPaymentById(@PathVariable("id") Long id);
}

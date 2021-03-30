package com.test.springcloud.service;

public interface PaymentService {

    //========服务降级==============
    public String paymentInfo_ok(Integer id);

    public String paymentInfo_Timeout(Integer id);

    //========服务熔断=================

    public String paymentCricuitBreaker(Integer id);
}

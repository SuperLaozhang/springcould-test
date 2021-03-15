package com.test.springcloud.controller;

import com.test.springcloud.entities.ConmonResult;
import com.test.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Company： NanJing xinwang Technology Co.,Ltd
 * Copyright: 2019 Copyright(C). All rights Reserved
 *
 * @Title: com.test.springcloud.controller.OrderController
 * @Description:
 * @author: ZhangZiWen
 * @CreateDate: 2021/3/15 15:56
 * <p>
 * Modification  History:
 * Date              Author     Discription
 * 2021/3/15 15:56   ZhangZiWen    Create File.
 */
@RestController
@Slf4j
public class OrderController {

    private static final String patment_url = "http://localhost:8001";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/create")
    public ConmonResult<Payment> create(Payment payment){
        return restTemplate.postForObject(patment_url+"/payment/create",payment,ConmonResult.class);

    }

    @GetMapping(value = "/consumer/payment/get/{id}")
    public ConmonResult<Payment> getPayment(@PathVariable("id") Long id){
        return restTemplate.getForObject(patment_url+"/payment/getPaymentById/"+id,ConmonResult.class);
    }

}

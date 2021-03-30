package com.test.springcloud.controller;

import com.test.springcloud.entities.ConmonResult;
import com.test.springcloud.entities.Payment;
import com.test.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Company： NanJing xinwang Technology Co.,Ltd
 * Copyright: 2019 Copyright(C). All rights Reserved
 *
 * @Title: com.test.springcloud.controller.OrderFeignController
 * @Description:
 * @author: ZhangZiWen
 * @CreateDate: 2021/3/18 10:27
 * <p>
 * Modification  History:
 * Date              Author     Discription
 * 2021/3/18 10:27   ZhangZiWen    Create File.
 */
@RestController
@Slf4j
public class OrderFeignController {

    @Autowired
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public ConmonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentById(id);
    }
}

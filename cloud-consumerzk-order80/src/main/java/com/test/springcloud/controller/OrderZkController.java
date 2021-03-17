package com.test.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Company： NanJing xinwang Technology Co.,Ltd
 * Copyright: 2019 Copyright(C). All rights Reserved
 *
 * @Title: com.test.springcloud.controller.OrderZkController
 * @Description:
 * @author: ZhangZiWen
 * @CreateDate: 2021/3/16 15:09
 * <p>
 * Modification  History:
 * Date              Author     Discription
 * 2021/3/16 15:09   ZhangZiWen    Create File.
 */
@RestController
@Slf4j
public class OrderZkController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String invoker_url = "http://cloud-provider-payment";

    @GetMapping(value = "/consumer/payment/zk")
    public String paymentInfo(){
        String result = restTemplate.getForObject(invoker_url+"/payment/zk",String.class);
        return result;
    }
}

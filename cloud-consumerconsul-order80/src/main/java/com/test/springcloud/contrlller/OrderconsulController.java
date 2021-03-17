package com.test.springcloud.contrlller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Company： NanJing xinwang Technology Co.,Ltd
 * Copyright: 2019 Copyright(C). All rights Reserved
 *
 * @Title: com.test.contrlller.OrderconsulMain
 * @Description:
 * @author: ZhangZiWen
 * @CreateDate: 2021/3/16 16:31
 * <p>
 * Modification  History:
 * Date              Author     Discription
 * 2021/3/16 16:31   ZhangZiWen    Create File.
 */
@RestController
@Slf4j
public class OrderconsulController {

    private static final String invoker_url = "http://cloud-provider-payment";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/consual")
    public String paymentInfo(){
        String result = restTemplate.getForObject(invoker_url+"/payment/consul",String.class);
        return result;
    }
}

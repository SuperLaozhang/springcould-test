package com.test.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Company： NanJing xinwang Technology Co.,Ltd
 * Copyright: 2019 Copyright(C). All rights Reserved
 *
 * @Title: com.test.springcloud.controller.PaymentController
 * @Description:
 * @author: ZhangZiWen
 * @CreateDate: 2021/3/11 23:34
 * <p>
 * Modification  History:
 * Date              Author     Discription
 * 2021/3/11 23:34   ZhangZiWen    Create File.
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/zk")
    public String paymentzk(){
        return "springcloud with zookeeper:" + serverPort + UUID.randomUUID().toString();
    }
}

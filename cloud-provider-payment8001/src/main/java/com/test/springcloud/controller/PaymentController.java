package com.test.springcloud.controller;

import com.test.springcloud.entities.ConmonResult;
import com.test.springcloud.entities.Payment;
import com.test.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping(value = "/payment/create")
    public ConmonResult create(Payment payment){
        int result = paymentService.create(payment);
        log.info("*******插入结果：" + result);
        if(result > 0){
            return new ConmonResult(200,"插入数据成功,serverPort:" + serverPort,result);
        }else {
            return new ConmonResult(404,"插入数据失败,serverPort:" + serverPort,null);

        }
    }

    @GetMapping(value = "/payment/getPaymentById/{id}")
    public ConmonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("*******插入结果：" + payment);
        if(payment != null){
            return new ConmonResult(200,"查询成功,serverPort："+ serverPort,payment);
        }else {
            return new ConmonResult(404,"查询失败，serverPort："+serverPort,null);

        }
    }

    @GetMapping(value = "/payment/index")
    public String index(){
       return "index";
    }


    @GetMapping(value = "/payment/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for(String service : services){
            log.info("*******service:" + service);
        }

        // 一个微服务下的全部实例
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info(instance.getServiceId() + "\t" + instance.getHost() + "\t" + instance.getPort() + instance.getUri());
        }
        return this.discoveryClient;


    }
}

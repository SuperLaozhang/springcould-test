package com.test.springcloud.controller;

import com.test.springcloud.entities.ConmonResult;
import com.test.springcloud.entities.Payment;
import com.test.springcloud.lb.LoadBalancer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

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

//    private static final String patment_url = "http://localhost:8001";
      private static final String patment_url = "http://CLOUD-PAYMENT-SERVICE";


    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancer loadBalancer;
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping(value = "/consumer/payment/create")
    public ConmonResult<Payment> create(Payment payment){
        return restTemplate.postForObject(patment_url+"/payment/create",payment,ConmonResult.class);

    }

    @GetMapping(value = "/consumer/payment/get/{id}")
    public ConmonResult<Payment> getPayment(@PathVariable("id") Long id){
        return restTemplate.getForObject(patment_url+"/payment/getPaymentById/"+id,ConmonResult.class);
    }

    @GetMapping(value = "/consumer/payment/getForEntry/{id}")
    public ConmonResult<Payment> getPayment2(@PathVariable("id") Long id){
        ResponseEntity<ConmonResult> responseEntity = restTemplate.getForEntity(patment_url+"/payment/getPaymentById/"+id,ConmonResult.class);
        if(responseEntity.getStatusCode().is2xxSuccessful()){
            return responseEntity.getBody();
        }else{
            return new ConmonResult<>(444,"操作失败");
        }
    }

    @GetMapping(value = "/consumer/payment/lb")
    public String getPayment3(){
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        if(instances == null || instances.size() <= 0){
            return null;
        }
        ServiceInstance serviceInstance = loadBalancer.instance(instances);
        URI url = serviceInstance.getUri();
        return restTemplate.getForObject(url+"/payment/lb",String.class);
    }

}

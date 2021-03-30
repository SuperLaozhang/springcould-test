package com.test.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Company： NanJing xinwang Technology Co.,Ltd
 * Copyright: 2019 Copyright(C). All rights Reserved
 *
 * @Title: com.test.springcloud.OrderHystrixMain80
 * @Description:
 * @author: ZhangZiWen
 * @CreateDate: 2021/3/18 14:01
 * <p>
 * Modification  History:
 * Date              Author     Discription
 * 2021/3/18 14:01   ZhangZiWen    Create File.
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class OrderHystrixMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixMain80.class,args);
    }
}

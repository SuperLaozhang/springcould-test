package com.test.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Company： NanJing xinwang Technology Co.,Ltd
 * Copyright: 2019 Copyright(C). All rights Reserved
 *
 * @Title: com.test.springcloud.OrderMain83
 * @Description:
 * @author: ZhangZiWen
 * @CreateDate: 2021/3/29 10:12
 * <p>
 * Modification  History:
 * Date              Author     Discription
 * 2021/3/29 10:12   ZhangZiWen    Create File.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class OrderMain83 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain83.class,args);
    }
}

package com.test.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Company： NanJing xinwang Technology Co.,Ltd
 * Copyright: 2019 Copyright(C). All rights Reserved
 *
 * @Title: com.test.springcloud.OrderConsulMain
 * @Description:
 * @author: ZhangZiWen
 * @CreateDate: 2021/3/16 16:38
 * <p>
 * Modification  History:
 * Date              Author     Discription
 * 2021/3/16 16:38   ZhangZiWen    Create File.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsulMain {
    public static void main(String[] args) {
        SpringApplication.run(OrderConsulMain.class,args);
    }
}

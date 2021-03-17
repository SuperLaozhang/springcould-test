package com.test.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Company： NanJing xinwang Technology Co.,Ltd
 * Copyright: 2019 Copyright(C). All rights Reserved
 *
 * @Title: com.test.springcloud.OrderMain
 * @Description:
 * @author: ZhangZiWen
 * @CreateDate: 2021/3/16 15:04
 * <p>
 * Modification  History:
 * Date              Author     Discription
 * 2021/3/16 15:04   ZhangZiWen    Create File.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZkMain {

    public static void main(String[] args) {
        SpringApplication.run(OrderZkMain.class,args);
    }
}

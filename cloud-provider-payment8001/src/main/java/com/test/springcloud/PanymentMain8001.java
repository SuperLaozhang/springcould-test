package com.test.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Company： NanJing xinwang Technology Co.,Ltd
 * Copyright: 2019 Copyright(C). All rights Reserved
 *
 * @Title: com.test.springcloud.PanymentMain8001
 * @Description:
 * @author: ZhangZiWen
 * @CreateDate: 2021/3/11 22:41
 * <p>
 * Modification  History:
 * Date              Author     Discription
 * 2021/3/11 22:41   ZhangZiWen    Create File.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class PanymentMain8001 {

    public static void main(String[] args) {
        SpringApplication.run(PanymentMain8001.class,args);
    }
}

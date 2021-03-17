package com.test.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Company： NanJing xinwang Technology Co.,Ltd
 * Copyright: 2019 Copyright(C). All rights Reserved
 *
 * @Title: com.test.springcloud.EurekaMain7001
 * @Description:
 * @author: ZhangZiWen
 * @CreateDate: 2021/3/15 20:52
 * <p>
 * Modification  History:
 * Date              Author     Discription
 * 2021/3/15 20:52   ZhangZiWen    Create File.
 */
@SpringBootApplication
//开启eureka服务注册中心，要用EnableEurekaServer
@EnableEurekaServer
public class EurekaMain7001 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7001.class,args);
    }
}

package com.test.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Company： NanJing xinwang Technology Co.,Ltd
 * Copyright: 2019 Copyright(C). All rights Reserved
 *
 * @Title: com.test.springcloud.GatewayMain9527
 * @Description:
 * @author: ZhangZiWen
 * @CreateDate: 2021/3/19 14:27
 * <p>
 * Modification  History:
 * Date              Author     Discription
 * 2021/3/19 14:27   ZhangZiWen    Create File.
 */
@SpringBootApplication
@EnableEurekaClient
public class GatewayMain9527 {

    public static void main(String[] args) {
        SpringApplication.run(GatewayMain9527.class,args);
    }
}

package com.test.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Company： NanJing xinwang Technology Co.,Ltd
 * Copyright: 2019 Copyright(C). All rights Reserved
 *
 * @Title: com.test.springcloud.NacosConfigClientMain3377
 * @Description:
 * @author: ZhangZiWen
 * @CreateDate: 2021/3/29 11:09
 * <p>
 * Modification  History:
 * Date              Author     Discription
 * 2021/3/29 11:09   ZhangZiWen    Create File.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigClientMain3377 {

    public static void main(String[] args) {
        SpringApplication.run(NacosConfigClientMain3377.class,args);
    }
}

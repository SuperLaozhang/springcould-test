package com.test.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Company： NanJing xinwang Technology Co.,Ltd
 * Copyright: 2019 Copyright(C). All rights Reserved
 *
 * @Title: com.test.springcloud.ConfigClient3355
 * @Description:
 * @author: ZhangZiWen
 * @CreateDate: 2021/3/22 16:06
 * <p>
 * Modification  History:
 * Date              Author     Discription
 * 2021/3/22 16:06   ZhangZiWen    Create File.
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClient3355 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClient3355.class,args);
    }
}

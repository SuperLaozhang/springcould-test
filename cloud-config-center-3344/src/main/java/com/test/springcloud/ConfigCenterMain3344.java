package com.test.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Company： NanJing xinwang Technology Co.,Ltd
 * Copyright: 2019 Copyright(C). All rights Reserved
 *
 * @Title: com.test.springcloud.ConfigCenterMain3344
 * @Description:
 * @author: ZhangZiWen
 * @CreateDate: 2021/3/22 15:41
 * <p>
 * Modification  History:
 * Date              Author     Discription
 * 2021/3/22 15:41   ZhangZiWen    Create File.
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterMain3344 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterMain3344.class,args);
    }
}

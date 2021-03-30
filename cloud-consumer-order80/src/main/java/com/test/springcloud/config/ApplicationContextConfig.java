package com.test.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Company： NanJing xinwang Technology Co.,Ltd
 * Copyright: 2019 Copyright(C). All rights Reserved
 *
 * @Title: com.test.springcloud.config.ApplicationContextConfig
 * @Description:
 * @author: ZhangZiWen
 * @CreateDate: 2021/3/15 16:01
 * <p>
 * Modification  History:
 * Date              Author     Discription
 * 2021/3/15 16:01   ZhangZiWen    Create File.
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
//    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}

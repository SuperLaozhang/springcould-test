package com.test.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Company： NanJing xinwang Technology Co.,Ltd
 * Copyright: 2019 Copyright(C). All rights Reserved
 *
 * @Title: com.test.springcloud.config.FeignConfig
 * @Description: feign的日志等级
 * @author: ZhangZiWen
 * @CreateDate: 2021/3/18 10:56
 * <p>
 * Modification  History:
 * Date              Author     Discription
 * 2021/3/18 10:56   ZhangZiWen    Create File.
 */
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}

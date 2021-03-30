package com.test.springcloud.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Company： NanJing xinwang Technology Co.,Ltd
 * Copyright: 2019 Copyright(C). All rights Reserved
 *
 * @Title: com.test.springcloud.controller.HystrixDashboardMain9001
 * @Description:
 * @author: ZhangZiWen
 * @CreateDate: 2021/3/19 11:36
 * <p>
 * Modification  History:
 * Date              Author     Discription
 * 2021/3/19 11:36   ZhangZiWen    Create File.
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardMain9001 {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardMain9001.class,args);
    }
}

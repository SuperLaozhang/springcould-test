package com.test.springcloud;

import com.test.rule.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * Company： NanJing xinwang Technology Co.,Ltd
 * Copyright: 2019 Copyright(C). All rights Reserved
 *
 * @Title: com.test.springcloud.OrderMain
 * @Description:
 * @author: ZhangZiWen
 * @CreateDate: 2021/3/15 15:51
 * <p>
 * Modification  History:
 * Date              Author     Discription
 * 2021/3/15 15:51   ZhangZiWen    Create File.
 */
@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(value = "CLOUD-PAYMENT-SERVICE",configuration = MyRule.class)
public class OrderMain {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain.class,args);
    }
}

package com.test.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Company： NanJing xinwang Technology Co.,Ltd
 * Copyright: 2019 Copyright(C). All rights Reserved
 *
 * @Title: com.test.springcloud.Order80Main
 * @Description:
 * @author: ZhangZiWen
 * @CreateDate: 2021/3/18 10:19
 * <p>
 * Modification  History:
 * Date              Author     Discription
 * 2021/3/18 10:19   ZhangZiWen    Create File.
 */
@SpringBootApplication
//开启Feign
@EnableFeignClients
public class Order80Main {

    public static void main(String[] args) {
        SpringApplication.run(Order80Main.class,args);
    }
}

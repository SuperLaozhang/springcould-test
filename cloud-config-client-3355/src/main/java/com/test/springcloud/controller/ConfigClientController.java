package com.test.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Company： NanJing xinwang Technology Co.,Ltd
 * Copyright: 2019 Copyright(C). All rights Reserved
 *
 * @Title: com.test.springcloud.controller.ConfigClientController
 * @Description:
 * @author: ZhangZiWen
 * @CreateDate: 2021/3/22 16:29
 * <p>
 * Modification  History:
 * Date              Author     Discription
 * 2021/3/22 16:29   ZhangZiWen    Create File.
 */
@RestController
@Slf4j
public class ConfigClientController {

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo(){
        return configInfo;
    }
}

package com.test.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Company： NanJing xinwang Technology Co.,Ltd
 * Copyright: 2019 Copyright(C). All rights Reserved
 *
 * @Title: com.test.springcloud.controller.ConfigClientController
 * @Description:
 * @author: ZhangZiWen
 * @CreateDate: 2021/3/29 11:11
 * <p>
 * Modification  History:
 * Date              Author     Discription
 * 2021/3/29 11:11   ZhangZiWen    Create File.
 */
@RestController
@RefreshScope //支持nacos的的动态刷新新功能
public class ConfigClientController {

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/config/info")
    public String getConfigInfo() {
        return configInfo;
    }
}

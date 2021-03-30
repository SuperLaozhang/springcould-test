package com.test.springcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Company： NanJing xinwang Technology Co.,Ltd
 * Copyright: 2019 Copyright(C). All rights Reserved
 *
 * @Title: com.test.springcloud.controller
 * @Description:
 * @author: ZhangZiWen
 * @CreateDate: 2021/3/22 16:36
 * <p>
 * Modification  History:
 * Date              Author     Discription
 * 2021/3/22 16:36   ZhangZiWen    Create File.
 */
@RestController
@RefreshScope
public class controller {

    @Value("${server.port}")
    private String serverPort;

    @Value("${config.info}")
    private String configInfo;


    @GetMapping("/configInfo")
    public String getConfigInfo(){
        return "serverPort:"+serverPort+"\t\n\n configInfo: "+configInfo;
    }
}

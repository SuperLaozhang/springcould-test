package com.test.springcloud.controller;

import com.test.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Company： NanJing xinwang Technology Co.,Ltd
 * Copyright: 2019 Copyright(C). All rights Reserved
 *
 * @Title: com.test.springcloud.controller.SendMessageController
 * @Description:
 * @author: ZhangZiWen
 * @CreateDate: 2021/3/22 22:45
 * <p>
 * Modification  History:
 * Date              Author     Discription
 * 2021/3/22 22:45   ZhangZiWen    Create File.
 */
@RestController
public class SendMessageController {

    @Resource
    private IMessageProvider messageProvider;

    @GetMapping(value = "/sendMessage")
    public String sendMessage()
    {
        return messageProvider.send();
    }
}

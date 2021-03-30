package com.test.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * Company： NanJing xinwang Technology Co.,Ltd
 * Copyright: 2019 Copyright(C). All rights Reserved
 *
 * @Title: com.test.springcloud.controller.ReceiveMessageListener
 * @Description:
 * @author: ZhangZiWen
 * @CreateDate: 2021/3/23 10:03
 * <p>
 * Modification  History:
 * Date              Author     Discription
 * 2021/3/23 10:03   ZhangZiWen    Create File.
 */
@Component
@EnableBinding(Sink.class)
public class ReceiveMessageListener {

    @Value("${server.port}")
    private String serverPort;

    @StreamListener(Sink.INPUT)
    public void input(Message<String> message){
        System.out.println("消费者一号------------->接受到消息：" + message.getPayload() + "\t serverport:" +serverPort);
    }
}

package com.test.springcloud.service.impl;

import com.test.springcloud.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

/**
 * Company： NanJing xinwang Technology Co.,Ltd
 * Copyright: 2019 Copyright(C). All rights Reserved
 *
 * @Title: com.test.springcloud.service.impl.PaymentFallbackServiceImpl
 * @Description:
 * @author: ZhangZiWen
 * @CreateDate: 2021/3/19 9:49
 * <p>
 * Modification  History:
 * Date              Author     Discription
 * 2021/3/19 9:49   ZhangZiWen    Create File.
 */
@Component
public class PaymentFallbackServiceImpl implements PaymentHystrixService {
    @Override
    public String paymentInfo_ok(Integer id) {
        return "PaymentFallbackServiceImpl fall back-payment_ok,O(∩_∩)O哈哈~";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
        return "PaymentFallbackServiceImpl fall back-payment_timeout,o(╥﹏╥)o";
    }
}

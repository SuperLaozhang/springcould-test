package com.test.springcloud.service.impl;

import com.test.springcloud.dao.PaymentDao;
import com.test.springcloud.entities.Payment;
import com.test.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Company： NanJing xinwang Technology Co.,Ltd
 * Copyright: 2019 Copyright(C). All rights Reserved
 *
 * @Title: com.test.springcloud.service.impl.PaymentServiceImpl
 * @Description:
 * @author: ZhangZiWen
 * @CreateDate: 2021/3/11 23:29
 * <p>
 * Modification  History:
 * Date              Author     Discription
 * 2021/3/11 23:29   ZhangZiWen    Create File.
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }
}

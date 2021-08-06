package com.zhoushucheng.springcloud.service.impl;

import com.zhoushucheng.springcloud.dao.PaymentDao;
import com.zhoushucheng.springcloud.entities.Payment;
import com.zhoushucheng.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}

package com.renan.paymentservice.services.impl;

import com.renan.paymentservice.model.Payment;
import com.renan.paymentservice.services.PaymentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class PaymentServiceImpl implements PaymentService {

    @Override
    public void sendPayment(Payment payment) {

    }
}

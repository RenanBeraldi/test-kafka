package com.renan.paymentservice.services;

import com.renan.paymentservice.model.Payment;

public interface PaymentService {
    void sendPayment(Payment payment);
}

package com.renan.paymentservice.resources.impl;

import com.renan.paymentservice.model.Payment;
import com.renan.paymentservice.resources.PaymentResource;
import com.renan.paymentservice.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/payments")
public class PaymentResourceImpl implements PaymentResource {

    @Autowired
    private PaymentService paymentService;

    @Override
    public ResponseEntity<Payment> payment(Payment payment) {
        paymentService.sendPayment(payment);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}

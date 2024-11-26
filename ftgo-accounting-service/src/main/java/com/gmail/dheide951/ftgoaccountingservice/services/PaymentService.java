package com.gmail.dheide951.ftgoaccountingservice.services;

import com.gmail.dheide951.ftgoaccountingservice.domain.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public PaymentDetails authorizeCard() {
        PaymentDetails paymentDetails = new PaymentDetails();
        paymentDetails.setStatus("APPROVED");
        return paymentDetails;
    }

}

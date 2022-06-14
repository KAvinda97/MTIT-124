package com.assigment4.Paymentservice.controller;

import com.assigment4.Paymentservice.dto.paymentRequest;
import com.assigment4.Paymentservice.dto.paymentResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/Payment")
public class paymentController {
    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody
    paymentResponse createCard(@RequestBody paymentRequest payReq) {

        System.out.println("Customer details" + payReq);

        var payResponse = new paymentResponse();
        payResponse.setPaymentID(UUID.randomUUID().toString());
        payResponse.setPaymentStatus("Ths is the message for success fully creating payment");
        return payResponse;
    }

}
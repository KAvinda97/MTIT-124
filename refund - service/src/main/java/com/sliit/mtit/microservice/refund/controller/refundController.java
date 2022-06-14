package com.sliit.mtit.microservice.refund.controller;

import com.sliit.mtit.microservice.refund.dto.refundRequest;
import com.sliit.mtit.microservice.refund.dto.refundResponse;
import com.sliit.mtit.microservice.refund.service.refundServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/refund")
public class refundController {

    @Autowired
    private refundServiceImpl feedbackService;

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody
    refundResponse createRefund(@RequestBody refundRequest refundRequest) {
        System.out.println("refund details :" + refundRequest);

        return feedbackService.createRefund(refundRequest);

    }
}

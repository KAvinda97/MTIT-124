package com.sliit.mtit.microservice.refund.service;

import com.sliit.mtit.microservice.refund.dto.refundRequest;
import com.sliit.mtit.microservice.refund.dto.refundResponse;
import com.sliit.mtit.microservice.refund.dto.userFeedbackRequest;
import com.sliit.mtit.microservice.refund.dto.userFeedbackResponse;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class refundServiceImpl {

    @Autowired
    private RestTemplate restTemplate;

    public refundResponse createRefund(refundRequest refundRequest){

        var userFeedbackRequest = new userFeedbackRequest();
        userFeedbackRequest.setFullName(userFeedbackRequest.getFullName());
        userFeedbackRequest.setEmail(userFeedbackRequest.getEmail());
        ResponseEntity<userFeedbackResponse> userFeedbackResponse = restTemplate.postForEntity("http://localhost:8080/feedback", userFeedbackRequest, userFeedbackResponse.class);

        var refundResponse = new refundResponse();
        refundResponse.setRefund_ID(UUID.randomUUID().toString());
        refundResponse.setFeedback_ID(userFeedbackResponse.getBody().getFeedback_ID());
        refundResponse.setMassage("Successfully done the Refund");

        return refundResponse;

    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();

    }

}

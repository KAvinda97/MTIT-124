package com.sliit.mtit.microservice.feedback.controller;


import com.sliit.mtit.microservice.feedback.dto.feedbackRequest;
import com.sliit.mtit.microservice.feedback.dto.feedbackResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/feedback")
public class feedbackController {


    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody
    feedbackResponse createFeedback(@RequestBody feedbackRequest feedbackRequest) {

        System.out.println("feedback details :" + feedbackRequest);

        var feedbackResponse = new feedbackResponse();
        feedbackResponse.setFeedback_ID(UUID.randomUUID().toString());
        feedbackResponse.setSubject("Successfully Got the Feedback");

        return feedbackResponse;


    }
}

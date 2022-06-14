package com.sliit.mtit.microservice.refund.dto;

public class userFeedbackResponse {

    private String feedback_ID;
    private String subject;

    public String getFeedback_ID() {
        return feedback_ID;
    }

    public void setFeedback_ID(String feedback_ID) {
        this.feedback_ID = feedback_ID;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}

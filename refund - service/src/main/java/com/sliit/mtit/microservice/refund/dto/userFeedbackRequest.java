package com.sliit.mtit.microservice.refund.dto;

public class userFeedbackRequest {

    private String fullName;
    private String feedback_ID;
    private String email;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFeedback_ID() {
        return feedback_ID;
    }

    public void setFeedback_ID(String feedback_ID) {
        this.feedback_ID = feedback_ID;
    }
}

package com.sliit.mtit.microservice.feedback.dto;

import java.util.StringJoiner;

public class feedbackRequest {

    private String product_ID;
    private String user_ID;
    private String about_you;
    private String email;
    private String issue;
    private String subject;
    private String description;
    private String attachments;

    public String getProduct_ID() {
        return product_ID;
    }

    public void setProduct_ID(String product_ID) {
        this.product_ID = product_ID;
    }

    public String getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(String user_ID) {
        this.user_ID = user_ID;
    }

    public String getAbout_you() {
        return about_you;
    }

    public void setAbout_you(String about_you) {
        this.about_you = about_you;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAttachments() {
        return attachments;
    }

    public void setAttachments(String attachments) {
        this.attachments = attachments;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", feedbackRequest.class.getSimpleName() + "[", "]")
                .add("product_ID='" + product_ID + "'")
                .add("user_ID='" + user_ID + "'")
                .add("about_you='" + about_you + "'")
                .add("email='" + email + "'")
                .add("issue='" + issue + "'")
                .add("subject='" + subject + "'")
                .add("description='" + description + "'")
                .add("attachments='" + attachments + "'")
                .toString();
    }
}

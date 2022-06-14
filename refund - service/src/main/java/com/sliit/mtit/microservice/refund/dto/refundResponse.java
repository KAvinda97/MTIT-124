package com.sliit.mtit.microservice.refund.dto;

public class refundResponse {

    private String refund_ID;
    private String feedback_ID;
    private String massage;

    public String getRefund_ID() {
        return refund_ID;
    }

    public void setRefund_ID(String refund_ID) {
        this.refund_ID = refund_ID;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public String getFeedback_ID() {
        return feedback_ID;
    }

    public void setFeedback_ID(String feedback_ID) {
        this.feedback_ID = feedback_ID;
    }
}

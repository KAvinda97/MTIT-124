package com.sliit.mtit.microservice.refund.dto;

import java.util.StringJoiner;

public class refundRequest {

    private String order_ID;
    private String product_ID;
    private String name;
    private String address;
    private String email;
    private String bill_NO;
    private String refund_Request;
    private String description;

    public String getOrder_ID() {
        return order_ID;
    }

    public void setOrder_ID(String order_ID) {
        this.order_ID = order_ID;
    }

    public String getProduct_ID() {
        return product_ID;
    }

    public void setProduct_ID(String product_ID) {
        this.product_ID = product_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBill_NO() {
        return bill_NO;
    }

    public void setBill_NO(String bill_NO) {
        this.bill_NO = bill_NO;
    }

    public String getRefund_Request() {
        return refund_Request;
    }

    public void setRefund_Request(String refund_Request) {
        this.refund_Request = refund_Request;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", refundRequest.class.getSimpleName() + "[", "]")
                .add("order_ID='" + order_ID + "'")
                .add("product_ID='" + product_ID + "'")
                .add("name='" + name + "'")
                .add("address='" + address + "'")
                .add("email='" + email + "'")
                .add("bill_NO='" + bill_NO + "'")
                .add("refund_Request='" + refund_Request + "'")
                .add("description='" + description + "'")
                .toString();
    }
}

package com.assigment4.Paymentservice.dto;

public class paymentRequest {


    private String userid;
    private String cardnumber;
    private String cvv;
    private String price;

    @Override
    public String toString() {
        return "paymentRequest{" +
                "userid='" + userid + '\'' +
                ", cardnumber='" + cardnumber + '\'' +
                ", cvv='" + cvv + '\'' +
                ", price='" + price + '\'' +
                '}';
    }



    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


}

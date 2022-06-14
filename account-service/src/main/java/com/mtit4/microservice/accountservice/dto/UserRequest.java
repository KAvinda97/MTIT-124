package com.mtit4.microservice.accountservice.dto;

public class UserRequest {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String repassword;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getRePassword() {
        return password;
    }

    public void setRePassword(String repassword) {
        this.repassword = repassword;
    }

    @Override
    public String toString() {
        return "UserRequest{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +", repassword='" + repassword + '\''+
                '}';
    }
}

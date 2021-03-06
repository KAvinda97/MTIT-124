package com.mtit4.microservice.orderservice.service;

import com.mtit4.microservice.orderservice.dto.OrderRequest;
import com.mtit4.microservice.orderservice.dto.OrderResponse;
import com.mtit4.microservice.orderservice.dto.UserCreationRequest;
import com.mtit4.microservice.orderservice.dto.UserCreationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class OrderServiceImpl {

    @Autowired
    private RestTemplate restTemplate;

    public OrderResponse createOrder(OrderRequest orderRequest){

        var userCreationRequest = new UserCreationRequest();
        userCreationRequest.setFirstName(orderRequest.getFirstName());
        userCreationRequest.setLastName(orderRequest.getLastName());
       userCreationRequest.setEmail(orderRequest.getBillingAddress());
        ResponseEntity<UserCreationResponse> userCreationResponse = restTemplate.postForEntity( "http://localhost:8080/users", userCreationRequest , UserCreationResponse.class);

        var orderResponse = new OrderResponse();
        orderResponse.setOrderId(UUID.randomUUID().toString());
        orderResponse.setUserId(userCreationResponse.getBody().getUserId());
        orderResponse.setMessage("Succesfully created the order");

        return orderResponse;
    }
    
  

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }
}

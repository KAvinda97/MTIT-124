package com.mtit4.microservice.orderservice.controller;

import com.mtit4.microservice.orderservice.dto.OrderRequest;
import com.mtit4.microservice.orderservice.dto.OrderResponse;
import com.mtit4.microservice.orderservice.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/orders")

public class OrderController {

    @Autowired
    private OrderServiceImpl orderService;

@PostMapping(consumes = "application/json",produces = "application/json")
public @ResponseBody OrderResponse createOrder(@RequestBody OrderRequest request){
    System.out.println("Order Details : "+ request);
    return orderService.createOrder(request);

}
}

package com.mtit4.microservice.deliveryservice.controller;


import com.mtit4.microservice.deliveryservice.dto.DeliveryRequest;
import com.mtit4.microservice.deliveryservice.dto.DeliveryResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody DeliveryResponse createDelivery(@RequestBody DeliveryRequest deliveryRequest){

        System.out.println("Delivery Details : "+ deliveryRequest);

        var deliveryResponse = new DeliveryResponse();
        deliveryResponse.setDeliveryId(UUID.randomUUID().toString());
        deliveryResponse.setMessage("Succsesfully added your product for delivery");

        return deliveryResponse;

    }
}

package com.assigment4.AddCard.controller;

import com.assigment4.AddCard.dto.AddToCardRequest;
import com.assigment4.AddCard.dto.AddToCardResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/Addtocard")
public class AddToCardControlelr {
    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody AddToCardResponse createCard(@RequestBody AddToCardRequest cardReq) {

        System.out.println("Customer details" + cardReq);

        var cardResponse = new AddToCardResponse();
        cardResponse.setCardID(UUID.randomUUID().toString());
        cardResponse.setMessage("This is the message for success fully creating card");
        return  cardResponse;
    }

}

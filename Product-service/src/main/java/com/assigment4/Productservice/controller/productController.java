package com.assigment4.Productservice.controller;

import com.assigment4.Productservice.dto.ProductRequest;
import com.assigment4.Productservice.dto.ProductResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/product")
public class productController {

    @PostMapping(consumes = "application/json" , produces = "application/json")
    public @ResponseBody ProductResponse createProduct(@RequestBody ProductRequest productRequest){

        System.out.println("Product :"+ productRequest);

        var productResponse =new ProductResponse();
        productResponse.setProductId(UUID.randomUUID().toString());
        productResponse.setMessage("Successfully created the product");

        return productResponse;
    }

}

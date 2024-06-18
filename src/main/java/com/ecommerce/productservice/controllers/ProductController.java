package com.ecommerce.productservice.controllers;

import com.ecommerce.productservice.models.Product;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")

public class ProductController {

    @GetMapping("/{identity}/{temp}")
    public String GetProductById(@PathVariable("identity") Long id, @PathVariable("temp") String x){
        return  "Here's the product "+id+ x;
    }

    //@RequestBody Product product-> converts received Json to a Product java object
    @PostMapping("")
    public String AddProduct(@RequestBody Product product){
        System.out.println(product.getCategory());
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        return "Product added";
    }
}

package com.abutua.product_backend.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping("product")
    public String getProduct() {
        return "Eu sou um produto!";
    }

}

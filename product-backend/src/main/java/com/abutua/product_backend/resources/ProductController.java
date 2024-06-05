package com.abutua.product_backend.resources;

import com.abutua.product_backend.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping("product")
    public Product getProduct() {

        Product p = new Product();
        p.setId(1);
        p.setName("Product 01");
        p.setPrice(100.50);

        return p;
    }

}

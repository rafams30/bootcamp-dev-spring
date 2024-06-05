package com.abutua.product_backend.resources;

import com.abutua.product_backend.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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

    @GetMapping("products")
    public List<Product> getProducts() {

        Product p1 = new Product();
        p1.setId(1);
        p1.setName("Product 01");
        p1.setPrice(100.50);

        Product p2 = new Product();
        p2.setId(2);
        p2.setName("Product 02");
        p2.setPrice(200.50);

        Product p3 = new Product();
        p3.setId(3);
        p3.setName("Product 03");
        p3.setPrice(300.50);

        List<Product> listProd = new ArrayList<>();
        listProd.add(p1);
        listProd.add(p2);
        listProd.add(p3);

        return listProd;

    }

}

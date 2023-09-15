package com.modelsis.modelsisspringbootfullstack.controllers;

import com.modelsis.modelsisspringbootfullstack.models.Product;
import com.modelsis.modelsisspringbootfullstack.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products/all")
    public Iterable<Product> getProducts() {
        return productService.getProducts();
    }

}

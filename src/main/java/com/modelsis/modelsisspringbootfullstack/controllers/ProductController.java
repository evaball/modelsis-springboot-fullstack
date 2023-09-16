package com.modelsis.modelsisspringbootfullstack.controllers;

import com.modelsis.modelsisspringbootfullstack.dtos.ProductDto;
import com.modelsis.modelsisspringbootfullstack.models.Product;
import com.modelsis.modelsisspringbootfullstack.repository.ProductRepository;
import com.modelsis.modelsisspringbootfullstack.services.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api")
public class ProductController {


    private final ProductService productService;
    private final ProductRepository productRepository;

    public ProductController(ProductService productService,
                             ProductRepository productRepository) {
        this.productService = productService;
        this.productRepository = productRepository;
    }

    @GetMapping("/product/all")
    public Iterable<Product> getAll(){
        return productService.getAll();
    }

    @PostMapping("/product/add")
    public ResponseEntity<?> addProduct(@RequestBody ProductDto productDto){
        return productService.create(productDto);

    }
    @PutMapping("/product/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody ProductDto productDto){
        return productService.update(productDto,id);
    }


}

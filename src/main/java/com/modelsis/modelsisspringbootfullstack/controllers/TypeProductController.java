package com.modelsis.modelsisspringbootfullstack.controllers;

import com.modelsis.modelsisspringbootfullstack.models.TypeProduct;
import com.modelsis.modelsisspringbootfullstack.services.TypeProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping("api")
    public class TypeProductController {
        @Autowired
        private TypeProductService typeProductService;

        @GetMapping("/typeProducts")
        public Iterable<TypeProduct> getTypeProducts() {
            return typeProductService.getTypeProducts();
        }
    }


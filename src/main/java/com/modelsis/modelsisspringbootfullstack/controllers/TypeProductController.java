package com.modelsis.modelsisspringbootfullstack.controllers;

import com.modelsis.modelsisspringbootfullstack.models.TypeProduct;
import com.modelsis.modelsisspringbootfullstack.services.TypeProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping("api")
    public class TypeProductController {

        private final TypeProductService typeProductService;

        public TypeProductController(TypeProductService typeProductService) {
            this.typeProductService = typeProductService;
        }

        @PostMapping("/typeProduct")
        public ResponseEntity<?> addType(@RequestBody String name){
            return typeProductService.create(name);
        }

        @GetMapping("/type/all")
        public List<TypeProduct> getAll(){
            return  typeProductService.getAll();
        }

    }


package com.modelsis.modelsisspringbootfullstack.controllers;

import com.modelsis.modelsisspringbootfullstack.dtos.TypeProductDto;
import com.modelsis.modelsisspringbootfullstack.models.TypeProduct;
import com.modelsis.modelsisspringbootfullstack.services.TypeProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api")
public class TypeProductController {

        private final TypeProductService typeProductService;

        public TypeProductController(TypeProductService typeProductService) {
            this.typeProductService = typeProductService;
        }

        @PostMapping("/productType")
        public ResponseEntity<?> addType(@RequestBody TypeProductDto typeProductDto){
            return typeProductService.create(typeProductDto);
        }

        @GetMapping("/type/all")
        public Iterable<TypeProduct> getAll(){
            return  typeProductService.getAll();
        }

    }


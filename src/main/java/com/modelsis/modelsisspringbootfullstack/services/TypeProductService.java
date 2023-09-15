package com.modelsis.modelsisspringbootfullstack.services;

import com.modelsis.modelsisspringbootfullstack.models.TypeProduct;
import com.modelsis.modelsisspringbootfullstack.repository.TypeProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TypeProductService {
    @Autowired
    private TypeProductRepository typeProductRepository;


    public Iterable<TypeProduct> getTypeProducts() {
        return typeProductRepository.findAll();
    }


    public TypeProduct saveTypeProduct(TypeProduct typeProduct) {
        TypeProduct savedTypeProduct= typeProductRepository.save(typeProduct);
        return savedTypeProduct;
    }
}

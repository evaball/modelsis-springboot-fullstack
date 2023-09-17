package com.modelsis.modelsisspringbootfullstack.services;

import com.modelsis.modelsisspringbootfullstack.dtos.TypeProductDto;
import com.modelsis.modelsisspringbootfullstack.models.TypeProduct;
import com.modelsis.modelsisspringbootfullstack.repository.TypeProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeProductService {

    private final TypeProductRepository typeProductRepository;
    public TypeProductService(TypeProductRepository typeProductRepository) {
        this.typeProductRepository = typeProductRepository;
    }
    public TypeProduct findById(int id){
        return typeProductRepository.findById((long) id).get();
    }
    public ResponseEntity<?> create(TypeProductDto typeProductDto){
        if (typeProductRepository.findTypeProductByName(typeProductDto.getName()).size()>0){
            return ResponseEntity.status(HttpStatus.CONFLICT)
                    .body("Ce nom est déjà utilisé.");
        }
        TypeProduct typeProduct = new TypeProduct();
        typeProduct.setName(typeProductDto.getName());
        typeProductRepository.save(typeProduct);
        return ResponseEntity.status(HttpStatus.OK).body("Type ajouté avec succés");

    }
    public Iterable<TypeProduct> getAll(){
        return typeProductRepository.findAll();
    }



//        return savedTypeProduct;
//
}

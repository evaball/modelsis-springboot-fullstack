package com.modelsis.modelsisspringbootfullstack.services;

import com.modelsis.modelsisspringbootfullstack.models.TypeProduct;
import com.modelsis.modelsisspringbootfullstack.repository.TypeProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
    public ResponseEntity<?> create(String name){
        if (typeProductRepository.findTypeProductByName(name) != null){
            return ResponseEntity.status(HttpStatus.CONFLICT)
                    .body("Ce nom est déjà utilisé.");
        }
        TypeProduct type = new TypeProduct();
        type.setName(name);

        return ResponseEntity.status(HttpStatus.OK).body("Type ajouté avec succés");

    }
    public List<TypeProduct> getAll(){
        return (List<TypeProduct>) typeProductRepository.findAll();
    }



//    public Iterable<TypeProduct> getTypeProducts() {
//        return typeProductRepository.findAll();
//    }


//    public TypeProduct saveTypeProduct(TypeProduct typeProduct) {
//        TypeProduct savedTypeProduct= typeProductRepository.save(typeProduct);
//        return savedTypeProduct;
//
}

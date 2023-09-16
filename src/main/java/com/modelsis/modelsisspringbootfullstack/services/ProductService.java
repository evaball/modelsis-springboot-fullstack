package com.modelsis.modelsisspringbootfullstack.services;


import com.modelsis.modelsisspringbootfullstack.dtos.ProductDto;
import com.modelsis.modelsisspringbootfullstack.models.Product;
import com.modelsis.modelsisspringbootfullstack.repository.ProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final TypeProductService typeProductService;

    LocalDate currentDate = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String formattedDate = currentDate.format(formatter);

    public ProductService(ProductRepository productRepository, TypeProductService typeProductService) {
        this.productRepository = productRepository;
        this.typeProductService = typeProductService;
    }
    public ResponseEntity<?> create(ProductDto productDto) {
        if (productRepository.findProductByName(productDto.getName()).size()>0){
            return ResponseEntity.status(HttpStatus.CONFLICT)
                    .body("Ce nom est déjà utilisé.");
        }
        Product product = new Product();
        product.setName(productDto.getName());
        product.setTypeProduct(productDto.getTypeProduct());
        product.setCreatedDate(formattedDate);
        productRepository.save(product);
        return ResponseEntity.status(HttpStatus.OK).body("Produit ajouté avec succés");

    }
    public Iterable<Product> getAll(){
        Iterable<Product> productList=productRepository.findAll();
        return productList;
    }

    public ResponseEntity<?> update(ProductDto productDto, int id){
        if (productRepository.findProductByName(productDto.getName()).size()>0 &&
                (productRepository.findProductByName(productDto.getName()).get(0).getId()!= id)){
            return ResponseEntity.status(HttpStatus.CONFLICT)
                    .body("Ce nom est déjà utilisé.");
        }

        Product product = findById(id);
        product.setName(productDto.getName());
        product.setTypeProduct(productDto.getTypeProduct());
        productRepository.save(product);
        return ResponseEntity.status(HttpStatus.OK).body("Produit modifié avec succés");


        }

    private Product findById(int id) {
        return productRepository.findById((long) id).get();
    }



}

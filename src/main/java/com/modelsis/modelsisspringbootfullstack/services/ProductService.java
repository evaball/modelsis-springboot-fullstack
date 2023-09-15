package com.modelsis.modelsisspringbootfullstack.services;


import com.modelsis.modelsisspringbootfullstack.converters.ProductConverter;
import com.modelsis.modelsisspringbootfullstack.dtos.ProductDto;
import com.modelsis.modelsisspringbootfullstack.models.Product;
import com.modelsis.modelsisspringbootfullstack.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

//    private final ProductConverter productConverter;
//
    @Autowired
    private  ProductRepository productRepository;

//    public ProductService(ProductConverter productConverter, ProductRepository productRepository){
//        this.productConverter= productConverter;
//        this.productRepository=productRepository;
//    }
    public Iterable<Product> getProducts() {
        return productRepository.findAll();
    }


//    public ResponseEntity<?> saveProduct(ProductDto productDto) {
//
//        Product product = productConverter.convertToEntity(productDto);
//        Product savedProduct= productRepository.save(product);
//        return ResponseEntity.ok(savedProduct);
//    }
//
//    public ResponseEntity<?> updateProduct(Long id, ProductDto productDto) {
//        Product product = productRepository.findById(id).orElseThrow(() -> new ChangeSetPersister.NotFoundException("Product not found with id: " + id));
//        product.setName(productDto.getName());
//        return productRepository.save(product);
//    }
}

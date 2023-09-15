package com.modelsis.modelsisspringbootfullstack.repository;

import com.modelsis.modelsisspringbootfullstack.models.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Long> {
    List<Product> findProductByName(String name);
}

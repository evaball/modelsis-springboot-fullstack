package com.modelsis.modelsisspringbootfullstack.repository;

import com.modelsis.modelsisspringbootfullstack.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}

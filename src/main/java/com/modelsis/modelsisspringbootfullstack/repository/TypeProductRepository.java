package com.modelsis.modelsisspringbootfullstack.repository;

import com.modelsis.modelsisspringbootfullstack.models.TypeProduct;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TypeProductRepository extends CrudRepository<TypeProduct, Long> {

    List<TypeProduct> findTypeProductByName(String name);
}

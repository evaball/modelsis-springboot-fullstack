package com.modelsis.modelsisspringbootfullstack.dtos;


import com.modelsis.modelsisspringbootfullstack.models.TypeProduct;
import lombok.Data;


@Data
public class ProductDto {

    private long id;

    private String name;

    private TypeProduct type;
}

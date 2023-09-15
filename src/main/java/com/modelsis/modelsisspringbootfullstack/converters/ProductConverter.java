package com.modelsis.modelsisspringbootfullstack.converters;

import com.modelsis.modelsisspringbootfullstack.dtos.ProductDto;
import com.modelsis.modelsisspringbootfullstack.models.Product;

public class ProductConverter {
    public ProductDto converterToDto(Product product){
        ProductDto productDto = new ProductDto();
        productDto.setId(product.getId());
        productDto.setName(product.getName());
        productDto.setType(product.getType());
        return productDto;

    }

    public Product convertToEntity(ProductDto productDto){
        Product product = new Product();
        product.setId(productDto.getId());
        product.setName(productDto.getName());
        product.setType(productDto.getType());
        return  product;
    }
}

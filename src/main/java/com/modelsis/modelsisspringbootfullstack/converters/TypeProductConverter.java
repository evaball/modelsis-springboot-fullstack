package com.modelsis.modelsisspringbootfullstack.converters;

import com.modelsis.modelsisspringbootfullstack.dtos.TypeProductDto;
import com.modelsis.modelsisspringbootfullstack.models.TypeProduct;

public class TypeProductConverter {

    public TypeProductDto converterToDto(TypeProduct typeProduct){
        TypeProductDto typeProductDto = new TypeProductDto();
        typeProductDto.setId(typeProduct.getId());
        typeProductDto.setName(typeProduct.getName());
        return typeProductDto;

    }

    public TypeProduct convertToEntity(TypeProductDto typeProductDto){
        TypeProduct typeProduct = new TypeProduct();
        typeProduct.setId(typeProductDto.getId());
        typeProduct.setName(typeProductDto.getName());
        return typeProduct;
    }
}

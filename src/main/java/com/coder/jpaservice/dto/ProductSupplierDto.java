package com.coder.jpaservice.dto;

import com.coder.jpaservice.model.ProductSupplierModel;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;

@Data
@AllArgsConstructor
public class ProductSupplierDto {

    private long idProduct;

    private long idSupplier;

    public static ProductSupplierDto from(ProductSupplierModel productSupplierModel){
        return new ProductSupplierDto(productSupplierModel.getIdProduct(), productSupplierModel.getIdSupplier());
    }
}

package com.coder.jpaservice.dto;

import com.coder.jpaservice.model.ProductSupplierModel;
import com.coder.jpaservice.model.SupplierModel;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@AllArgsConstructor
public class SupplierDto {

    private String name;

    private ProductSupplierModel productSupplierId;

    public static SupplierDto from(SupplierModel supplierModel){
        return new SupplierDto(supplierModel.getName(), supplierModel.getProductSupplierId());
    }
}

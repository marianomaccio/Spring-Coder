package com.coder.jpaservice.dto;

import com.coder.jpaservice.model.HeadingModel;
import com.coder.jpaservice.model.ProductModel;
import com.coder.jpaservice.model.ProductSupplierModel;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class ProductDto {

    private String name;

    private BigDecimal purchasePrice;

    private BigDecimal salePrice;

    private int stock;

    private String description;

    private char state;

    private ProductSupplierModel productSupplierId;

    private HeadingModel headingModel;

    public static ProductDto from(ProductModel productModel){
        return new ProductDto(productModel.getName(), productModel.getPurchasePrice(), productModel.getSalePrice(),
                productModel.getStock(), productModel.getDescription(), productModel.getState(), productModel.getProductSupplierId(),
                productModel.getHeadingModel());

    }
}

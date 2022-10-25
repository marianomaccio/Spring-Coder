package com.coder.jpaservice.service;

import com.coder.jpaservice.dto.ProductSupplierDto;
import com.coder.jpaservice.model.ProductSupplierModel;
import com.coder.jpaservice.repository.ProductSupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductSupplierService {
    @Autowired
    ProductSupplierRepository productSupplierRepository;


    public ProductSupplierDto findProductSupplierById(long id) {
        ProductSupplierModel productSupplierModel = productSupplierRepository.findById(id).orElseThrow(()-> new RuntimeException("Invalid product supplier"));
        ProductSupplierDto productSupplierDto = ProductSupplierDto.from(productSupplierModel);
        return productSupplierDto;
    }

    public ProductSupplierDto updateProductSupplierById(long id, ProductSupplierDto productSupplierDto) {
        ProductSupplierModel productSupplierModel = productSupplierRepository.findById(id).orElseThrow(()-> new RuntimeException("Invalid product supplier"));
        productSupplierModel.setIdProduct(productSupplierDto.getIdProduct());
        productSupplierModel.setIdSupplier(productSupplierDto.getIdSupplier());
        productSupplierRepository.save(productSupplierModel);
        ProductSupplierDto productSupplier = ProductSupplierDto.from(productSupplierModel);
        return productSupplier;
    }

    public ProductSupplierDto insertProductSupplier(ProductSupplierDto productSupplierDto) {
        ProductSupplierModel productSupplierModel = new ProductSupplierModel();
        productSupplierModel.setIdProduct(productSupplierDto.getIdProduct());
        productSupplierModel.setIdSupplier(productSupplierDto.getIdSupplier());
        productSupplierRepository.save(productSupplierModel);
        ProductSupplierDto productSupplier = ProductSupplierDto.from(productSupplierModel);
        return productSupplier;
    }
}

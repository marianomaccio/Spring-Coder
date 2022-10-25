package com.coder.jpaservice.service;

import com.coder.jpaservice.dto.SupplierDto;
import com.coder.jpaservice.model.SupplierModel;
import com.coder.jpaservice.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierService {
    @Autowired
    SupplierRepository supplierRepository;
    public SupplierDto findSupplierById(long id) {
        SupplierModel supplierModel = supplierRepository.findById(id).orElseThrow(()-> new RuntimeException("Invalid supplier"));
        SupplierDto supplierDto = SupplierDto.from(supplierModel);
        return supplierDto;
    }

    public SupplierDto updateSupplierById(long id, SupplierDto supplierDto) {
        SupplierModel supplierModel = supplierRepository.findById(id).orElseThrow(()->new RuntimeException("Invalid supplier"));
        supplierModel.setName(supplierDto.getName());
        supplierModel.setProductSupplierId(supplierDto.getProductSupplierId());
        supplierModel = supplierRepository.save(supplierModel);
        SupplierDto supplier = SupplierDto.from(supplierModel);
        return supplier;
    }

    public SupplierDto insertSupplierById(SupplierDto supplierDto) {
        SupplierModel supplierModel = new SupplierModel();
        supplierModel.setName(supplierDto.getName());
        supplierModel.setProductSupplierId(supplierDto.getProductSupplierId());
        supplierModel = supplierRepository.save(supplierModel);
        SupplierDto supplier = SupplierDto.from(supplierModel);
        return supplier;
    }
}

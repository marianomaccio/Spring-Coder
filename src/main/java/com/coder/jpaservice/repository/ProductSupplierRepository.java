package com.coder.jpaservice.repository;

import com.coder.jpaservice.model.ProductSupplierModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductSupplierRepository extends JpaRepository <ProductSupplierModel, Long> {
}

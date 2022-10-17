package com.coder.jpaservice.repository;

import com.coder.jpaservice.model.SupplierModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository <SupplierModel, Long> {
}

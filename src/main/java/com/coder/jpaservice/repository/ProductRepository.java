package com.coder.jpaservice.repository;

import com.coder.jpaservice.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository <ProductModel, Long> {
}

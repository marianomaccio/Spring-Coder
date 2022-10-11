package com.coder.jpaservice.repository;

import com.coder.jpaservice.model.PurchaseModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseRepository extends JpaRepository<PurchaseModel, Long> {
}

package com.coder.jpaservice.repository;

import com.coder.jpaservice.model.DetailBillModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailBillRepository extends JpaRepository <DetailBillModel, Long> {
}

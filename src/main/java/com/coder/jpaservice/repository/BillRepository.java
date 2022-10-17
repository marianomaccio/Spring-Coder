package com.coder.jpaservice.repository;

import com.coder.jpaservice.model.BillModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillRepository extends JpaRepository<BillModel, Long> {
}

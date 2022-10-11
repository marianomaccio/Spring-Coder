package com.coder.jpaservice.repository;

import com.coder.jpaservice.model.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository <ClientModel, Long> {
}

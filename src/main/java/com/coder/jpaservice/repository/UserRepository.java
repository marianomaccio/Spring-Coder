package com.coder.jpaservice.repository;

import com.coder.jpaservice.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <UserModel, Long> {
}

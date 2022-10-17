package com.coder.jpaservice.repository;

import com.coder.jpaservice.model.HeadingModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeadingRepository extends JpaRepository <HeadingModel, Long> {
}

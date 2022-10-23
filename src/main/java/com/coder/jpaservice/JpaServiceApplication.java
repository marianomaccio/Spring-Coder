package com.coder.jpaservice;

import com.coder.jpaservice.model.UserModel;
import com.coder.jpaservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;


@SpringBootApplication
public class JpaServiceApplication{
	@Autowired
	UserRepository userR;
	public static void main(String[] args) {

		SpringApplication.run(JpaServiceApplication.class, args);

	}

}

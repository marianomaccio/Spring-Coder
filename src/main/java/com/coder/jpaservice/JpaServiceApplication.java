package com.coder.jpaservice;

import com.coder.jpaservice.model.ClientModel;
import com.coder.jpaservice.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;


@SpringBootApplication
public class JpaServiceApplication{

	public static void main(String[] args) {

		SpringApplication.run(JpaServiceApplication.class, args);
	}

}

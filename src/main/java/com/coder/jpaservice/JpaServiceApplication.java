package com.coder.jpaservice;

import com.coder.jpaservice.model.UserModel;
import com.coder.jpaservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;


@SpringBootApplication
public class JpaServiceApplication implements CommandLineRunner {
	@Autowired
	UserRepository userR;
	public static void main(String[] args) {

		SpringApplication.run(JpaServiceApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		try{
			UserModel user = new UserModel();

			user.setUserName("Mariano");
			user.setPassword("root");
			userR.save(user);
			System.out.println("Se inserto:");

			//esta puesto 1L L de long ya que tengo el id declarado como long
			userR.findById(1L).stream().forEach(a -> System.out.println(a.getUserName() + "\n"
					+ a.getPassword() ));

			System.out.println("User guardado");

		}catch (Exception e){
			e.getMessage();
		}
	}
}

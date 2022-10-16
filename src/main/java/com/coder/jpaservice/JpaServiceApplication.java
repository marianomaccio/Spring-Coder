package com.coder.jpaservice;

import com.coder.jpaservice.model.ClientModel;
import com.coder.jpaservice.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;


@SpringBootApplication
public class JpaServiceApplication implements CommandLineRunner {
	@Autowired
	ClientRepository client;
	public static void main(String[] args) {

		SpringApplication.run(JpaServiceApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		try{
			ClientModel cliente = new ClientModel();

			cliente.setName("Mariano");
			cliente.setLastName("Maccio");
			cliente.setAddress("Buenos Aires");
			cliente.setBirth(LocalDate.of(2022,10,10));
			cliente.setIdentityDocument("123456711");
			cliente.setState('V');
			client.save(cliente);
			System.out.println("Se inserto:");

			//esta puesto 1L L de long ya que tengo el id declarado como long
			client.findById(1L).stream().forEach(a -> System.out.println(a.getName() + "\n"
					+ a.getLastName() + "\n" + a.getAddress() + "\n" + a.getIdentityDocument()
					+ "\n" + a.getBirth()));
			System.out.println("Cliente guardado");

		}catch (Exception e){
			e.getMessage();
		}
	}
}

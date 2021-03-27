package com.crud.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories
@SpringBootApplication
public class SbCruDwithRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbCruDwithRestApplication.class, args);
	}

}

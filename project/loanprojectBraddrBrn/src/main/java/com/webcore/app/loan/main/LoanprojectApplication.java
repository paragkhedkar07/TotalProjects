package com.webcore.app.loan.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories
@SpringBootApplication
public class LoanprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanprojectApplication.class, args);
		System.out.println("main load");
	}

}

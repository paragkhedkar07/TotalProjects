package com.parag.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class Ms1EurekaClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(Ms1EurekaClient1Application.class, args);
	}

}

package com.parag.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class Ms1EurekaServer8081Application {

	public static void main(String[] args) {
		SpringApplication.run(Ms1EurekaServer8081Application.class, args);
	}

}

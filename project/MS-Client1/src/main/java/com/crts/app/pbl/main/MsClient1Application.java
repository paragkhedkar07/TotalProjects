package com.crts.app.pbl.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class MsClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(MsClient1Application.class, args);
	}

}

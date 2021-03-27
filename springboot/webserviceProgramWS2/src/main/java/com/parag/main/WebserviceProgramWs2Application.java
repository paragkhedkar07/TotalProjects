package com.parag.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.client.RestTemplate;
@SpringBootApplication
public class WebserviceProgramWs2Application {

	public static void main(String[] args) {
		SpringApplication.run(WebserviceProgramWs2Application.class, args);
	}
	
	@Bean
	public RestTemplate rt()
	{
		RestTemplate rs=new RestTemplate();
		return rs;
	}

}

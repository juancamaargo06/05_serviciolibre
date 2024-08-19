package com.edu.ue.client.servilibre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan(basePackages = {"com.edu.ue.client.controller","com.edu.ue.client.service", "com.edu.ue.client"})
public class ServilibreApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServilibreApplication.class, args);
	}
	@Bean
	public RestTemplate template(){
		return new RestTemplate();
	}

}

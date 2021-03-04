package com.simple.webfluxdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@SpringBootApplication
@EnableR2dbcRepositories
public class WebfluxdbApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebfluxdbApplication.class, args);
	}

}

package com.github.c4rlosmonteiro.cleanarchproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableFeignClients
@SpringBootApplication
public class CleanarchprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CleanarchprojectApplication.class, args);
	}

}

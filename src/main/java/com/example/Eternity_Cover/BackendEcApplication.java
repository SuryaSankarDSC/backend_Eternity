package com.example.Eternity_Cover;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class BackendEcApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendEcApplication.class, args);
	}

}

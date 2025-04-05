package com.library.apiLibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class ApiLibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiLibraryApplication.class, args);
	}

}

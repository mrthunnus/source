package com.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ControllerApplication {

	@Bean
	public CommandLineRunner usage() {
		return args -> {
					System.out.println("<------Started------>");
		};
	}

	/*@Bean
	public CommandLineRunner tutorial() {
		return new Runner();
	}*/

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ControllerApplication.class, args);
	}
}
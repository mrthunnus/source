package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServiceApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ServiceApplication.class, args);
	}
}
package com.example.smconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SmConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmConfigServerApplication.class, args);
	}

}

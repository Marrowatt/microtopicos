package com.example.MicroTopicos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

//@SpringBootApplication
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class MicroTopicosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroTopicosApplication.class, args);
	}

}

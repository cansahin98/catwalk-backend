package com.example.catwalk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@ComponentScan("com.example")
public class CatwalkApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatwalkApplication.class, args);
	}

}

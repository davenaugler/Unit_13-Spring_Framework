package com.coderscampus.unit13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// @ComponentScan("com.coderscampus") - left in as a reminder that it exists
public class Unit13Application {

	public static void main(String[] args) {
		SpringApplication.run(Unit13Application.class, args);
	}

}

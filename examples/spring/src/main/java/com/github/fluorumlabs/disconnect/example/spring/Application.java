package com.github.fluorumlabs.disconnect.example.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.github.fluorumlabs.disconnect.spring.server", "com.github.fluorumlabs.disconnect.example.spring"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

package com.madhu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(App01Application.class, args);
		System.out.println("madhu");
	}

}

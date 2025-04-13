package com.teluskopravin.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringdemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringdemoApplication.class, args); //we get object of application context to access the objects in the container inside JVM for classes we created
		// Alien alien = new Alien();
		// alien.code();
		Alien obj = context.getBean(Alien.class);
		obj.code();
		System.out.print("Hello world");
	}

}

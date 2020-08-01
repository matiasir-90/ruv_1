package com.ruv;

import java.util.TimeZone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RuvApplication {
	
	public static void main(String[] args) {
		TimeZone.setDefault(TimeZone.getTimeZone("UTC")); 
		SpringApplication.run(RuvApplication.class, args);
		System.out.println("Hello World!!");
	}

}

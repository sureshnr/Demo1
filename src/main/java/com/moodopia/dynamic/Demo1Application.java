package com.moodopia.dynamic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
/**
 * Started application for spring defines the components scan
 * 
 */
@SpringBootApplication
@ComponentScan(basePackages={"com.moodopia.dynamic", 
							 "com.moodopia.model", 
							 "com.moodopia.controllers",
							 "com.moodopia.config",
							 "com.moodopia.services",
							 "com.moodopia.dao" })
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}
}

package com.mongodb.mon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;



@SpringBootApplication
@EnableEurekaClient
public class MonApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonApplication.class, args);
	}
	 
	  
}

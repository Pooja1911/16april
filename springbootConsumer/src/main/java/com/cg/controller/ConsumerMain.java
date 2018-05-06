package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
//@EnableAutoConfiguration
@ComponentScan(basePackages="com.cg")
public class ConsumerMain {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx=SpringApplication.run(ConsumerMain.class, args);
	}

}

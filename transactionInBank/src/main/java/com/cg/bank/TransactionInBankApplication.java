package com.cg.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableEurekaClient
//@EnableFeignClients
public class TransactionInBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransactionInBankApplication.class, args);
	}

	
}


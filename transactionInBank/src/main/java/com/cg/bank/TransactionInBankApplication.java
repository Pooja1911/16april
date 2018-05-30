package com.cg.bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.client.RestTemplate;

import com.cg.bank.entities.AuditLog;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class TransactionInBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransactionInBankApplication.class, args);
	}

	
}


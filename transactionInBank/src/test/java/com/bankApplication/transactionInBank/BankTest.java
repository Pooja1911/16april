package com.bankApplication.transactionInBank;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.cg.bank.entities.Bank;
@DataJpaTest
public class BankTest {

	@Test
	public void chkbankAdd() {
		final RestTemplate restTemplate = new RestTemplate();
		final BigDecimal big = new BigDecimal(0);
		final Bank bank = new Bank();
		bank.setAmount(big);
		// Bank bank1=new Bank(1L,big);
		final String uri = "http://localhost:8080/bank/bankCreate";
		final Bank ban = restTemplate.postForObject(uri, bank, Bank.class);
		assertEquals(ban.getAmount(), bank.getAmount());
	}

	@Test
	public void checkBankDetails() {
		final RestTemplate restTemplate = new RestTemplate();
		final String uri = "http://localhost:8080/bank/getBankDetails";
		final BigDecimal big = new BigDecimal(0);
		Bank bank1 = new Bank(1L, big);
		final List<Bank> list1 = new ArrayList();
		list1.add(bank1);
		final ResponseEntity<Bank[]> response = restTemplate.getForEntity(uri, Bank[].class);
    	Bank [] list = response.getBody();
		assertNotEquals(list.length , 0);
	}
	
	
}
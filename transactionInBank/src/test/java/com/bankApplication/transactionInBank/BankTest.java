package com.bankApplication.transactionInBank;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import com.cg.bank.entities.Bank;

public class BankTest {
	
	
	
@Test
 public void chkbankAdd()
 {
	final RestTemplate restTemplate = new RestTemplate();
final BigDecimal big = new BigDecimal(0);
final Bank bank=new Bank();
bank.setAmount(big);
//Bank bank1=new Bank(1L,big);
String uri = "http://localhost:8080/bank/bankCreate";
final Bank ban = restTemplate.postForObject(uri, bank, Bank.class);
assertEquals(ban.getAmount(),bank.getAmount()); 
 }


@Test
public void checkBankDetails()
{
	final RestTemplate restTemplate = new RestTemplate();
	String uri = "http://localhost:8080/bank/getBankDetails";
	final BigDecimal big = new BigDecimal(0);
	Bank bank1=new Bank(1L,big);
	List<Bank> list1=new ArrayList();
	list1.add(bank1);
	//List<Bank> list=restTemplate.get(uri,list1);
}
}
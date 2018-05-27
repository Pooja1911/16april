package com.bankApplication.transactionInBank;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.cg.bank.Exception.BankException;
import com.cg.bank.entities.Bank;
import com.cg.bank.service.BankServiceImpl;
import com.cg.bank.service.IBankService;
@RunWith(SpringRunner.class)
public class BankTest {
	
	IBankService bankService=new BankServiceImpl();
	 Bank bank;
	 BigDecimal big;
	@Before
	public void init()
	{
	 big = new BigDecimal(0);
	 bank = new Bank(1L,big);
	}

	@Test
	public void chkbankAdd()throws BankException {
		
				//bank.setAmount(big);
		Bank b1=bankService.createBank(bank);
		System.out.println("bank"+b1);
		assertEquals(b1,bank);
		
	
		
	}

	@Test(expected=BankException.class)
	public void checkBankDetails() throws BankException {
		Bank bank=new Bank();
		Bank bank1=bankService.createBank(bank);
		assertEquals("No bank is Added",bank1);
		
	}
	
@Test
public void checkgetById() throws BankException
{

	Optional<Bank> b1=bankService.getBankDetailsByID(1L);
	final Bank bankopt=b1.get();
	 assertEquals(bank,b1);
	
}
@Test(expected=BankException.class)
public void checkgetByID() throws BankException
{
	Optional<Bank> b1=bankService.getBankDetailsByID(1L);
	assertEquals(b1,"No such bank found");
}


@Test
public void checkforallbank() throws BankException
{
	List<Bank> list=bankService.getBankDetails();
	assertEquals(list,bank);
}

@Test(expected=BankException.class)
public void checkforAllbankException() throws BankException
{
	List<Bank> list=bankService.getBankDetails();
	assertEquals(list,"no bank found");

}
}
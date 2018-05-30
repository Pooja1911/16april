package com.bankApplication.transactionInBank;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.when;

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
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.cg.bank.Exception.BankException;
import com.cg.bank.entities.Bank;
import com.cg.bank.repository.BankRepository;
import com.cg.bank.service.BankServiceImpl;
import com.cg.bank.service.IBankService;
@RunWith(SpringRunner.class)
public class BankTest {
	
	@Mock
	BankRepository bankRepo;
	@InjectMocks
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
		when(bankRepo.save(bank)).thenReturn(bank);
		Bank b1=bankService.createBank(bank);
		System.out.println("bank"+b1);
		assertEquals(b1,bank);
		
	
		
	}

	@Test(expected=BankException.class)
	public void checkBankDetails() throws BankException  {
		Bank bank1=null;
		when(bankRepo.save(bank1)).thenReturn(null);
		Bank bank11=bankService.createBank(bank);
	
		
	}
	
@Test
public void checkgetById() throws BankException
{
	Optional<Bank> bankopt=Optional.of(bank);
	when(bankRepo.findBybankId(1L)).thenReturn(bankopt);
	Optional<Bank> b1=bankService.getBankDetailsByID(1L);
	 assertEquals(bankopt,b1);
	 
}
@Test(expected=BankException.class)
public void checkgetByID() throws BankException
{	Optional<Bank> bankopt=Optional.empty();
	when(bankRepo.findBybankId(2L)).thenReturn(bankopt);
	Optional<Bank> b1=bankService.getBankDetailsByID(2L);

}


@Test
public void checkforallbank() throws BankException

{   List<Bank> list=new ArrayList();
list.add(bank);
	when(bankRepo.findAll()).thenReturn(list);
	List<Bank> list1=bankService.getBankDetails();
	assertEquals(list1,list);
}

@Test(expected=BankException.class)
public void checkforAllbankException() throws BankException
{ List<Bank> list=new ArrayList();
   //list.add(bank);
	when(bankRepo.findAll()).thenReturn(list);
	List<Bank> list1=bankService.getBankDetails();
	

}
}
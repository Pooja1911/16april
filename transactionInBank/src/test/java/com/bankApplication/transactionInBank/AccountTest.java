package com.bankApplication.transactionInBank;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.bank.entities.Account;

@RunWith(SpringRunner.class)
public class AccountTest {
	
	Account account;
	@Before
	public void init()
	{
		account=new Account();
	}
	@Test
	public void checkaccountcreate()
	{
		
	}

}

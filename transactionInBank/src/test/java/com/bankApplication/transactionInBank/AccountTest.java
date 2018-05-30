package com.bankApplication.transactionInBank;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.bank.entities.Account;
import com.cg.bank.repository.AccountRepository;
import com.cg.bank.service.AccountServiceImpl;
import com.cg.bank.service.IAccountService;

@RunWith(SpringRunner.class)
public class AccountTest {
	
	@Mock
	AccountRepository accoutnRepo;
	
	@InjectMocks
	IAccountService accountServcie=new AccountServiceImpl();
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

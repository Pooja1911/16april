package com.cg.bank.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bank.entities.Account;
import com.cg.bank.repository.AccountRepository;
@Service("accountService")
public class AccountServiceImpl implements IAccountService{
    @Autowired
	private AccountRepository accountRepository;
	@Override
	public Account createAccount(Account account) {
		// TODO Auto-generated method stub
		return accountRepository.save(account) ;
	}

	@Override
	public String depositMoney(BigDecimal amount) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public String withdrawlMoney(BigDecimal amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account getAccountDetails(Long id) {
		// TODO Auto-generated method stub
		Account account=accountRepository.findById(id).get();
		return account;
	}

}

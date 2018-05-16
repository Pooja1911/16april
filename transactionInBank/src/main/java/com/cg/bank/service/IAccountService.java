package com.cg.bank.service;

import java.math.BigDecimal;

import com.cg.bank.entities.Account;

public interface IAccountService {
	public Account createAccount(Account account);
	public String depositMoney(BigDecimal amount);
	public String withdrawlMoney(BigDecimal amount);
	public Account getAccountDetails(Long id);

}

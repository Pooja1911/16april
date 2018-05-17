package com.cg.bank.service;

import java.math.BigDecimal;

import com.cg.bank.Exception.BankException;
import com.cg.bank.entities.Account;
import com.cg.bank.vo.AccountTransaction;

public interface IAccountService {
	public Account createAccount(Account account) throws BankException;

	public String depositMoney(AccountTransaction account) throws BankException;

	public String withdrawlMoney(AccountTransaction account) throws BankException;

	public Account getAccountDetails(Long id) throws BankException;

}

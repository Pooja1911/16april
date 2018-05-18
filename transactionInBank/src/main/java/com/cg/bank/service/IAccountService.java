package com.cg.bank.service;

import com.cg.bank.Exception.BankException;
import com.cg.bank.entities.Account;
import com.cg.bank.vo.AccountTransaction;

public interface IAccountService {
	/**
	 * method name : createAccount return type : Account object parameter :object of
	 * Account class description : this method will return a account which is
	 * created
	 */
	Account createAccount(final Account account) throws BankException;

	/**
	 * method name : depositMoney return type : String parameter :object of
	 * AccountTransaction class description : this method will return a string if
	 * successfully amount is added and add to transaction list
	 */
	String depositMoney(final AccountTransaction account) throws BankException;

	/**
	 * method name : withdrawlMoney return type : String object parameter :object of
	 * AccountTransaction class description : this method will return a string if
	 * successfully withdraw and add to transaction list
	 */
	String withdrawlMoney(final AccountTransaction account) throws BankException;

	/**
	 * method name : getAccountDetails return type : Account object parameter :Long
	 * id description : this method will return a account which is created of given
	 * id
	 */
	Account getAccountDetails(final Long id) throws BankException;

}

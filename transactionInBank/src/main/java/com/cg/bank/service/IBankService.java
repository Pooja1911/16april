package com.cg.bank.service;

import java.util.List;
import java.util.Optional;

import com.cg.bank.Exception.BankException;
import com.cg.bank.entities.Bank;

public interface IBankService {
	/**
	 * method name : createBank return type : Bank object parameter :object of ATM
	 * description : this method will return a bank which is created
	 */
	Bank createBank(final Bank bank) throws BankException;

	/**
	 * method name : getBankDetails return type : List<Bank> description : this
	 * method will return a list of all banks
	 */
	List<Bank> getBankDetails() throws BankException;

	/**
	 * method name : getBankDetailsByID return type : Optional parameter :long
	 * description : this method will return a bank of given id
	 */
	Optional<Bank> getBankDetailsByID(final long Id) throws BankException;

}

package com.cg.bank.service;

import java.util.List;
import java.util.Optional;

import com.cg.bank.Exception.BankException;
import com.cg.bank.entities.Transaction;

/**
 * @author Pooja jain
 *
 */
public interface ITransactionService {
	/**
	 * method name : createTransaction return type : Transaction object parameter
	 * :Transaction description : this method will return a transaction which is
	 * created
	 */
	Transaction createTransaction(final Transaction trans) throws BankException;

	/**
	 * method name : generateTransactionReport return type : List<Transaction>
	 * Object description : this method will return a list which of transactions
	 */
	List<Transaction> generateTransactionReport(Long accountId) throws BankException;

}

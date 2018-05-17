package com.cg.bank.service;

import java.util.List;

import com.cg.bank.Exception.BankException;
import com.cg.bank.entities.Transaction;

public interface ITransactionService {
	public Transaction createTransaction(Transaction trans) throws BankException;

	public List<Transaction> generateTransactionReport() throws BankException;

}

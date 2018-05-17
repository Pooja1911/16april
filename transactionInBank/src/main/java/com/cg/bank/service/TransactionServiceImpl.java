package com.cg.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bank.Exception.BankException;
import com.cg.bank.entities.Transaction;
import com.cg.bank.repository.TransactionRepository;
@Service("transactionService")
public class TransactionServiceImpl implements ITransactionService{

	@Autowired
	private TransactionRepository transact;
	@Override
	public Transaction createTransaction(final Transaction trans) throws BankException {
		final Transaction transaction =transact.save(trans);
		if(transaction!=null)
		{
		return transaction;
		}
		else
		{
			throw new BankException("no transaction has been created");
		}
	}

	@Override
	public List<Transaction> generateTransactionReport() throws BankException {
		// TODO Auto-generated method stub
		List<Transaction> tran=transact.findAll();
		if(tran.isEmpty())
		{
			throw new BankException("no list generated");
		}
		else
		{
		return tran;
		}
	}

}

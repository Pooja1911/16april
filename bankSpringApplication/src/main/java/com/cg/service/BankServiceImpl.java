package com.cg.service;

import java.util.List;

import com.cg.model.Bank;
import com.cg.repository.BankDaoImpl;
import com.cg.repository.IBankDao;

public class BankServiceImpl implements IBankService{
public IBankDao bankDao=new BankDaoImpl();

	public List<Bank> addBank(Bank bank) {
		// TODO Auto-generated method stub
		return bankDao.addBank(bank);
	}
	

}

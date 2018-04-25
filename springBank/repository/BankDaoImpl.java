package com.cg.repository;

import java.util.ArrayList;
import java.util.List;

import com.cg.model.Bank;

public class BankDaoImpl implements IBankDao{

	public List<Bank> addBank(Bank bank) {
		List<Bank> list=new ArrayList();
	
		list.add(bank);
		// TODO Auto-generated method stub
		return list;
		
	}
	

}

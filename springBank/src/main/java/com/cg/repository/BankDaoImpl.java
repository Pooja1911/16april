package com.cg.repository;

import java.util.ArrayList;
import java.util.List;

import com.cg.model.Bank;

public class BankDaoImpl implements IBankDao{
	
	 private List<Bank> list;

	public List<Bank> addBank(Bank bank) {
		if(list.isEmpty())
		{
		 list=new ArrayList<Bank>();
		list.add(bank);}
		else
		{
			list.add(bank);
		}
		// TODO Auto-generated method stub
		return list;
		
	}
	

}

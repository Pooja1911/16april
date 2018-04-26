package com.cg.repository;

import java.util.ArrayList;
import java.util.List;

import com.cg.model.Bank;

public class BankDaoImpl implements IBankDao{
	
	 private List<Bank> list;

	public List<Bank> addBank(Bank bank) {
		if( this.list ==null )
		{
			this.list=new ArrayList<Bank>();
			this.list.add(bank);}
		else
		{
			this.list.add(bank);
		}
		// TODO Auto-generated method stub
		System.out.println(""+this.list);
		return this.list;
		
	}
	

}

package com.cg.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cg.model.SavingAccount;

public class SavingAccountImpl implements IAccountDao {
	SavingAccount savingAccount=new SavingAccount();
	float balance=savingAccount.getBalance();
	public List withdraw(float amount) {
		// TODO Auto-generated method stub
		
		
			 balance=balance-amount; 
		 Date date = new Date();
		 List list=new ArrayList();
		 list.add(date);
		 list.add("Amount withdraw is"+amount);
	
		 return list;
		
	}

	public List deposit(float amount) {
		// TODO Auto-generated method stub
		//SavingAccount savingAccount=new SavingAccount();
		 balance=savingAccount.getBalance();
		balance=balance+amount;
		
		 Date date = new Date();
		 List list=new ArrayList();
		 list.add(date);
		 list.add("Amount deposited is"+amount);
		 return list;
		
	}

	public List<SavingAccount> getStatment(List list) {
		// TODO Auto-generated method stub
		List list1=new ArrayList();
		list1.add(list);
        return list1;	
	}

}

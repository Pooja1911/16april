package com.cg.service;

import java.util.List;

import com.cg.model.SavingAccount;



public interface IAccountService {

	//public float withdraw(float amount,float bal);
	public SavingAccount deposit(float amount,SavingAccount save);
	//public List<SavingAccount> getStatment(List list);
	public SavingAccount withdraw(float withdrawAmount,SavingAccount save);

}

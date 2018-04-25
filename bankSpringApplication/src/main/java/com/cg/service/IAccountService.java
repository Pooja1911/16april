package com.cg.service;

import java.util.List;

import com.cg.model.SavingAccount;



public interface IAccountService {

	public List withdraw(float amount);
	public List deposit(float amount);
	public List<SavingAccount> getStatment(List list);

}

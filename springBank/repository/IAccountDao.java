package com.cg.repository;

import java.util.ArrayList;
import java.util.List;

import com.cg.model.Bank;
import com.cg.model.SavingAccount;



public interface IAccountDao {

	public List withdraw(float amount);
	public List deposit(float amount);
	public List<SavingAccount> getStatment(List list);
}

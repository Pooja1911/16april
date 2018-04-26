package com.cg.service;

import java.util.List;

import com.cg.model.SavingAccount;

public interface IAccountService {

	public List<SavingAccount> addAccount(SavingAccount account);
	public SavingAccount deposit(float amount,SavingAccount save);

	public SavingAccount withdraw(float withdrawAmount,SavingAccount save);

}

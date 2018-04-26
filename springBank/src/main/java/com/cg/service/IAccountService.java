package com.cg.service;

import com.cg.model.SavingAccount;

public interface IAccountService {

	
	public SavingAccount deposit(float amount,SavingAccount save);

	public SavingAccount withdraw(float withdrawAmount,SavingAccount save);

}

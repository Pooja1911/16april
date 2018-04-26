package com.cg.service;

import java.util.logging.Logger;

import com.cg.model.SavingAccount;

public class AccountServiceImpl implements IAccountService {
	final Logger LOGGER = Logger.getLogger(AccountServiceImpl.class.getName());

	SavingAccount savingAccount;

	public SavingAccount withdraw(float amount, SavingAccount save) {

		float balance = save.getBalance();
		if (balance < amount) {
			LOGGER.info("your balance is less than amount!!!");

		} else if (amount < 0) {
			LOGGER.info("Negative amount is not possible");

		} else {

			balance = balance - amount;
			save.setBalance(balance);

		}

		return save;
	}

	public SavingAccount deposit(float amount, SavingAccount save) {

		if (amount < 0) {
			LOGGER.info("Negative amount is not possible");

		} else {
			float balance = save.getBalance();
			balance = balance + amount;
			save.setBalance(balance);

		}
		return save;
	}

}

package com.cg.service;

import java.util.List;
import java.util.logging.Logger;

import com.cg.model.SavingAccount;
import com.cg.repository.IAccountDao;

public class AccountServiceImpl implements IAccountService {
	final Logger LOGGER = Logger.getLogger(AccountServiceImpl.class.getName());
     IAccountDao accountDao;
	SavingAccount savingAccount;
public AccountServiceImpl() {
	// TODO Auto-generated constructor stub
}
	/**
	 * @param accountDao
	 */
	public AccountServiceImpl(IAccountDao accountDao) {
		super();
		this.accountDao = accountDao;
	}

	public SavingAccount withdraw(final float amount, final SavingAccount save) {

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

	public SavingAccount deposit(final float amount, final SavingAccount save) {

		if (amount < 0) {
			LOGGER.info("Negative amount is not possible");

		} else {
			float balance = save.getBalance();
			balance = balance + amount;
			save.setBalance(balance);

		}
		return save;
	}

	public List<SavingAccount> addAccount(SavingAccount account) {
		// TODO Auto-generated method stub
		return accountDao.addAccount(account);
	}

}

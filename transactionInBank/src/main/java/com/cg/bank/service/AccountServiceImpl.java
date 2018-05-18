package com.cg.bank.service;

import java.math.BigDecimal;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bank.Exception.BankException;
import com.cg.bank.entities.Account;
import com.cg.bank.entities.Bank;
import com.cg.bank.entities.Customer;
import com.cg.bank.entities.Transaction;
import com.cg.bank.repository.AccountRepository;
import com.cg.bank.repository.BankRepository;
import com.cg.bank.repository.CustomerRepository;
import com.cg.bank.repository.TransactionRepository;
import com.cg.bank.vo.AccountTransaction;

@Service("accountService")
public class AccountServiceImpl implements IAccountService {
	final Logger LOGGER = LoggerFactory.getLogger(AccountServiceImpl.class);
	@Autowired
	private AccountRepository accountRepository;
	@Autowired
	private TransactionRepository trans;
	@Autowired
	private CustomerRepository customerRepo;

	@Autowired
	Transaction transaction;
	@Autowired
	private BankRepository bankRepo;
	private BigDecimal balance;

	/*
	 * method name : createAccount return type : Account object parameter :object of
	 * Account class description : this method will return a account which is
	 * created
	 */
	@Override
	public Account createAccount(final Account account) throws BankException {
		final Account acc = accountRepository.save(account);
		if (acc != null) {
			return acc;
		} else {
			throw new BankException("No account is created");
		}
	}

	/*
	 * method name : depositMoney return type : String parameter :object of
	 * AccountTransaction class description : this method will return a string if
	 * successfully amount is added and add to transaction list
	 */
	@Override
	public String depositMoney(final AccountTransaction account) throws BankException {
		final Optional<Account> acc1 = accountRepository.findById(account.getAccountId());
		if (acc1.isPresent()) {
			final Account acc = acc1.get();
			balance = acc.getAmount();
			balance = balance.add(account.getAmount());
			acc.setAmount(balance);
			final Optional<Bank> bank = bankRepo.findById(account.getBankId());
			if (bank.isPresent()) {
				final Bank bank1 = bank.get();
				bank1.setAmount(balance);
				bankRepo.save(bank1);
			}
			Transaction transaction = new Transaction();
			transaction.setAccount(acc);
			transaction.setAmount(acc.getAmount());
			final Customer customer = customerRepo.findById(account.getCustomerId()).get();
			transaction.setCustomer(customer);
			transaction.setTransactionType("credit");
			trans.save(transaction);
			return "data is added";
		} else {
			throw new BankException("zero amount  deposited");
		}

	}

	/*
	 * method name : withdrawlMoney return type : String object parameter :object of
	 * AccountTransaction class description : this method will return a string if
	 * successfully withdraw and add to transaction list
	 */
	@Override
	public String withdrawlMoney(final AccountTransaction account) throws BankException {
		// TODO Auto-generated method stub
		Optional<Account> acc1 = accountRepository.findById(account.getAccountId());
		if (acc1.isPresent()) {
			final Account account1 = acc1.get();
			balance = account1.getAmount();
			balance = balance.subtract(account.getAmount());
			account1.setAmount(balance);
			final Optional<Bank> bank = bankRepo.findById(account.getBankId());
			if (bank.isPresent()) {
				final Bank bank1 = bank.get();
				bank1.setAmount(balance);
				bankRepo.save(bank1);

				// Transaction transaction=new Transaction();
				transaction.setAccount(account1);
				transaction.setAmount(account1.getAmount());
				final Customer customer = customerRepo.findById(account.getCustomerId()).get();
				transaction.setCustomer(customer);
				transaction.setTransactionType("debit");
				trans.save(transaction);
			}
			return "amount is deducted";
		} else {
			throw new BankException("No amount withdraw");
		}

	}

	/*
	 * method name : getAccountDetails return type : Account object parameter :Long
	 * id description : this method will return a account which is created of given
	 * id
	 */
	@Override
	public Account getAccountDetails(final Long id) throws BankException {
		// TODO Auto-generated method stub
		Account account = accountRepository.findById(id).get();
		if (account != null) {
			return account;
		} else {
			throw new BankException("no such element found");
		}
	}

}

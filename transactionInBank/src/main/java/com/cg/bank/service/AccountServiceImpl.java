package com.cg.bank.service;

import java.math.BigDecimal;
import java.util.Optional;

import javax.transaction.Transactional;

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
	private ITransactionService trans;
	@Autowired
	private ICustomerService customerService;
	@Autowired
	private IBankService bankService;
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
			LOGGER.info("account created");
			return acc;
		} else {
			LOGGER.error("no account is created");
			throw new BankException("No account is created");
		}
	}

	/*
	 * method name : depositMoney return type : String parameter :object of
	 * AccountTransaction class description : this method will return a string if
	 * successfully amount is added and add to transaction list
	 */
	@Transactional
	@Override
	public Long depositMoney(final AccountTransaction account) throws BankException {
		if (account.getAmount().compareTo(BigDecimal.ZERO) > 0) {
		final Optional<Account> acc1 = accountRepository.findById(account.getAccountId());
		if (acc1.isPresent()) {
			final Account acc = acc1.get();
			balance = acc.getAmount();
			balance = balance.add(account.getAmount());
			acc.setAmount(balance);
			final Optional<Bank> bank = bankService.getBankDetailsByID(account.getBankId());
			if (bank.isPresent()) {
				final Bank bank1 = bank.get();
				bank1.setAmount(balance);
				bankService.createBank(bank1);
			}else
			{   LOGGER.error("no bank id present");
				throw new BankException("no bank is present of given id");
			}
			Transaction transaction = new Transaction();
			transaction.setAccount(acc);
			transaction.setAmount(acc.getAmount());
			final Customer customer = customerService.getCustomerDetails(account.getCustomerId());
			transaction.setCustomer(customer);
			transaction.setTransactionType("credit");
			trans.createTransaction(transaction);
			LOGGER.info("AMOUNT IS ADDED");
			return account.getCustomerId();
		} else {
			LOGGER.error("no amount is deposited");
			throw new BankException("zero amount  deposited");
		}
		}
		else
		{
			LOGGER.error("-ve amount is not possible");
			throw new BankException("negative amount is not possible");
		}
	}

	/*
	 * method name : withdrawlMoney return type : String object parameter :object of
	 * AccountTransaction class description : this method will return a string if
	 * successfully withdraw and add to transaction list
	 */
	@Transactional
	@Override
	public Long withdrawlMoney(final AccountTransaction account) throws BankException {
		// TODO Auto-generated method stub
		if (account.getAmount().compareTo(BigDecimal.ZERO) > 0) {
		Optional<Account> acc1 = accountRepository.findById(account.getAccountId());
		if (acc1.isPresent()) {
			final Account account1 = acc1.get();                                                                     ;
			balance = account1.getAmount();
			balance = balance.subtract(account.getAmount());
			account1.setAmount(balance);
			final Optional<Bank> bank = bankService.getBankDetailsByID(account.getBankId());
			if (bank.isPresent()) {
				final Bank bank1 = bank.get();
				bank1.setAmount(balance);
				bankService.createBank(bank1);

				Transaction transaction=new Transaction();
				transaction.setAccount(account1);
				transaction.setAmount(account1.getAmount());
				final Customer customer = customerService.getCustomerDetails(account.getCustomerId());
				if(customer!=null)
				{
				transaction.setCustomer(customer);
				transaction.setTransactionType("debit");
				trans.createTransaction(transaction);
				LOGGER.info("amount is deducted");
				return account.getCustomerId();
				}
				else
				{ LOGGER.error("no customer exist");
					throw new BankException("No customer of such occunct exsit");
				}
			}else
			{LOGGER.error("no account exist");
				throw new BankException("No such account exist");
			}
			
		} else {
			LOGGER.error("not  enough amount to withdraw");
			throw new BankException("No amount withdraw");
		}
		}
		else
		{
			LOGGER.error("-ve value is not posssible");
			throw new BankException("negative amount is not possible");
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
		Account account =  accountRepository.findById(id).get();
		if (account != null) {
			LOGGER.info("account retrived");
			return account;
		} else {
			LOGGER.error("no such id exist");
			throw new BankException("no such element found");
		}
	}

}

package com.cg.bank.service;

import java.math.BigDecimal;
import java.util.Optional;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bank.Exception.BankException;
import com.cg.bank.entities.ATM;
import com.cg.bank.entities.Account;
import com.cg.bank.entities.Bank;
import com.cg.bank.entities.Customer;
import com.cg.bank.entities.Transaction;
import com.cg.bank.repository.ATMRepository;
import com.cg.bank.repository.AccountRepository;
import com.cg.bank.repository.BankRepository;
import com.cg.bank.repository.CustomerRepository;
import com.cg.bank.repository.TransactionRepository;
import com.cg.bank.vo.AddMoneyReq;
import com.cg.bank.vo.WithrawMoneyReq;

@Service("atmService")
public class ATMServiceImpl implements IATMService {

	final Logger LOGGER = LoggerFactory.getLogger(ATMServiceImpl.class);
	/**
	 * autowiring atmrepository to atmservcie
	 */
	@Autowired
	private ATMRepository atmRepo;
	@Autowired
	private IBankService bankService; 
	@Autowired
	private IAccountService accountService;
	@Autowired
	private ICustomerService customerService;
	@Autowired
	private TransactionRepository trans;
	@Autowired
	private IAtmDenoService atmDeno;

	@Override
	public ATM createATM(final ATM atm) throws BankException {
		// TODO Auto-generated method stub
		final ATM atm1 = atmRepo.save(atm);
		if (atm1 != null) {
			LOGGER.info("atm is added");
			return atm1;
		} else {
			LOGGER.error("no atm is added");
			throw new BankException("No such atm is created!!");
		}
	}
    @Transactional
	@Override
	public String addMoneyFromBank(final AddMoneyReq atmreq) throws BankException {
		// TODO Auto-generated method stub
		final Optional<ATM> atm = atmRepo.findById(atmreq.getAtmId());
		if (atm.isPresent()) {
			ATM atm1 = atm.get(); 
			final Long bankID = atmreq.getBankId();
			final Long bankId = atm1.getBankId();
			if (bankID.equals(bankId)) {
				final BigDecimal amount = atmreq.getAmount();
				final Optional<Bank> bankopt=bankService.getBankDetailsByID(atmreq.getBankId());
				final Bank bank=bankopt.get();
				BigDecimal bankAmount = bank.getAmount();
				if (amount.compareTo(BigDecimal.ZERO) > 0) {
					if (amount.compareTo(bankAmount) == -1) {
						BigDecimal atmAmount = atm1.getAmount();
						atmAmount = atmAmount.add(amount);
						atm1.setAmount(atmAmount);
						bankAmount = bankAmount.subtract(amount);
						bank.setAmount(bankAmount);
						bankService.createBank(bank);
						atmRepo.save(atm1);
						atmDeno.atmDenominationDeposit(atmreq.getAmount(), atmreq.getAtmId()); 
						LOGGER.info("amount is added to your account");
						return "amount added";

					}
					else
					{ LOGGER.error("low balance");
						throw new BankException("your account balance is less than you want");
					}
				}
					else
					{
						LOGGER.error("amount is negative");
						throw new BankException("amount connot be negative");
					}
				
			}
			else
			{
				LOGGER.error("no bank id exist");
				throw new BankException("no such bank id exist");
			}
		}
		else
		{
			LOGGER.error("no atm id exist");
			throw new BankException("no such atm id exist");
		}
		
	}
    @Transactional
	@Override
	public Long withrawMoney(final WithrawMoneyReq withdraw) throws BankException {
		final Optional<ATM> atm = atmRepo.findById(withdraw.getAtmId());
		if (atm.isPresent()) {
			final ATM atm1 = atm.get();
			BigDecimal amount = atm1.getAmount();
			if (amount.compareTo(BigDecimal.ZERO) > 0) {
			if (amount.compareTo(withdraw.getAmount()) == 1) {
				final Account account =accountService.getAccountDetails(withdraw.getAccountId());
				BigDecimal accountAmount = account.getAmount();
				if (accountAmount.compareTo(withdraw.getAmount()) == 1) {
					amount = amount.subtract(withdraw.getAmount());
					atm1.setAmount(amount);
					accountAmount = accountAmount.subtract(withdraw.getAmount());
					account.setAmount(accountAmount);
					accountService.createAccount(account);
					atmRepo.save(atm1);
					Transaction transaction = new Transaction();
					transaction.setAccount(account);
					transaction.setAmount(account.getAmount());
					final Customer customer = customerService.getCustomerDetails(withdraw.getCustomerId());
					transaction.setCustomer(customer);
					transaction.setTransactionType("debit");
					trans.save(transaction);
					atmDeno.atmDenominationWithdraw(withdraw.getAmount(), withdraw.getAtmId());
					LOGGER.info("amount is deducted");
					return withdraw.getAccountId();
				}
				else
				{ LOGGER.error("low balance");
					throw new BankException("your account balance is less thsn amount you want to withdraw");
				}
			}
			else
			{  LOGGER.error("atm amount is less");
				throw new BankException("atm does not have this much of amount");
			}
		}
		else
		{ LOGGER.error("-ve amount not possible ");
			throw new BankException("negative amount cannot possible");
		}
	}
		else
		{ LOGGER.error("no atm id exist");
			throw new BankException("no such id of atm exist");
		}
	}
}

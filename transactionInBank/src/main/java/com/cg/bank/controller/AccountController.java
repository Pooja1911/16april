package com.cg.bank.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bank.Exception.BankException;
import com.cg.bank.entities.Account;
import com.cg.bank.entities.Bank;
import com.cg.bank.entities.Customer;
import com.cg.bank.service.IAccountService;
import com.cg.bank.service.IBankService;
import com.cg.bank.service.ICustomerService;
import com.cg.bank.vo.AccountRequest;
import com.cg.bank.vo.AccountTransaction;

@RestController
public class AccountController {

	@Autowired
	IAccountService accountService;
	@Autowired
	ICustomerService customerService;
	@Autowired
	IBankService bankService;
	String message = null;

	/*
	 * method name : createAccount return type : responseEntitiy object parameter :
	 * object of AccountRequest class description : this method will return a
	 * created account mapping : post
	 */
	@PostMapping("/accountCreate")
	public ResponseEntity<?> createAccount(@RequestBody final AccountRequest accountRe) {
		Account response = null;
		Optional<Bank> bank;
		try {
			bank = bankService.getBankDetailsByID(accountRe.getBankId());

			if (bank.isPresent()) {
				Customer cust;
				try {
					cust = customerService.getCustomerDetails(accountRe.getCustomerId());

					final Account acc = accountRe.getAccount();
					acc.setBank(bank.get());
					acc.setCustomer(cust);
					try {
						response = accountService.createAccount(acc);
					} catch (BankException e) {
						message = e.getMessage();
						return new ResponseEntity<String>(message, HttpStatus.OK);
					}
				} catch (BankException e) {
					message = e.getMessage();
					return new ResponseEntity<String>(message, HttpStatus.OK);
				}
			}

			return new ResponseEntity<Account>(response, HttpStatus.CREATED);
		} catch (BankException e) {
			message = e.getMessage();
			return new ResponseEntity<String>(message, HttpStatus.OK);
		}

	}

	/*
	 * method name : getAccount return type : responseEntitiy object parameter :
	 * Path variable of Long type description : this method will return a created
	 * account of a given id mapping : get
	 */

	@GetMapping("/accountDetails/{id}")
	public ResponseEntity<?> getAccount(@PathVariable Long id) {
		Account acc;
		try {
			acc = accountService.getAccountDetails(id);
			return new ResponseEntity<Account>(acc, HttpStatus.OK);
		} catch (BankException e) {
			message = e.getMessage();
			return new ResponseEntity<String>(message, HttpStatus.OK);
		}

	}

	/*
	 * method name : depositAccount return type : responseEntitiy object parameter :
	 * object of AccountTransaction class description : this method will return a
	 * success String if money is deposited mapping : post
	 */

	@PostMapping("/accountDeposit")
	public ResponseEntity<?> depositAccount(@RequestBody final AccountTransaction account) {
		try {
			String msg = accountService.depositMoney(account);
			return new ResponseEntity<String>(msg, HttpStatus.OK);

		} catch (BankException e) {
			message = e.getMessage();
			return new ResponseEntity<String>(message, HttpStatus.OK);
		}
	}

	/*
	 * method name : withdrawAccount return type : responseEntitiy object parameter
	 * : object of AccountTransaction class description : this method will return a
	 * success message string if amount is deducted mapping : post
	 */

	@PostMapping("/accountwithdraw")
	public ResponseEntity<?> withdrawAccount(@RequestBody final AccountTransaction account) {
		try {
			String msg = accountService.withdrawlMoney(account);
			return new ResponseEntity<String>(msg, HttpStatus.OK);

		} catch (BankException e) {
			message = e.getMessage();
			return new ResponseEntity<String>(message, HttpStatus.OK);
		}
	}

}

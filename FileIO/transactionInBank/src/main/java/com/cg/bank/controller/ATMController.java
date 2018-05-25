package com.cg.bank.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bank.Exception.BankException;
import com.cg.bank.entities.ATM;
import com.cg.bank.entities.Bank;
import com.cg.bank.service.IATMService;
import com.cg.bank.service.IBankService;
import com.cg.bank.vo.ATMReq;
import com.cg.bank.vo.AddMoneyReq;
import com.cg.bank.vo.WithrawMoneyReq;

@RestController
public class ATMController {

	@Autowired
	private IATMService atmService;
	@Autowired
	private IBankService bankService;



	/*
	 * method name : createATM return type : responseEntitiy object parameter :
	 * object of ATMReq class description : this method will return a created atm
	 * mapping : post
	 */
	@PostMapping("/atmCreate")
	public ResponseEntity<?> createATM(@RequestBody final ATMReq atm) {

		ATM atm1 = null;
		try {
			final Optional<Bank> bank = bankService.getBankDetailsByID(atm.getBankId());
			ATM atm2 = atm.getAtm();
			atm2.setBankId(bank.get().getBankId());
			atm1 = atmService.createATM(atm2);
			return new ResponseEntity<ATM>(atm1, HttpStatus.CREATED);
		} catch (BankException e) {
			String message = e.getMessage();
			return new ResponseEntity<String>(message, HttpStatus.OK);
		}

	}
	/*
	 * method name : addMoneyToAtm return type : responseEntitiy object parameter :
	 * object of AddMonyReq class description : this method will return a success
	 * message String if successfully added mapping : post
	 */

	@PostMapping("/addMoneyInAtm")
	public ResponseEntity<?> addMoneyToATM(@RequestBody final AddMoneyReq atm) {

		try {
			final String str = atmService.addMoneyFromBank(atm);
			return new ResponseEntity<String>(str, HttpStatus.OK);
		} catch (BankException e) {
			String message = e.getMessage();
			return new ResponseEntity<String>(message, HttpStatus.OK);
		}

	}

	/*
	 * method name : withdrawFromAtm return type : responseEntitiy object parameter
	 * : object of WithdrawMoneyReq class description : this method will return
	 * success message String if amount is successfully deducted mapping : post
	 */
	@PostMapping("/withdrawAtm")
	public ResponseEntity<?> withdrawFromAtm(@RequestBody final WithrawMoneyReq atm) {

		try {
			final Long id = atmService.withrawMoney(atm);
			return new ResponseEntity<Long>(id, HttpStatus.OK);
		} catch (BankException e) {
			String message = e.getMessage();
			return new ResponseEntity<String>(message, HttpStatus.OK);
		}

	}
}

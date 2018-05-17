package com.cg.bank.controller;

import java.math.BigDecimal;
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
	
	private String message;
	@PostMapping("/atmCreate")
	public ResponseEntity<?> createATM(@RequestBody final ATMReq atm) {

		ATM atm1 = null;
		try {
			Optional<Bank> bank=bankService.getBankDetailsByID(atm.getBankId());
			System.out.println(">>>>>>>>>>"+bank);
                			
				ATM atm2=atm.getAtm();
				atm2.setBankId(bank.get().getBankId());
			 atm1 = atmService.createATM(atm2);					 
			return new ResponseEntity<ATM>(atm1, HttpStatus.CREATED);

		}
	catch (BankException e) {
			message=e.getMessage();
			return new ResponseEntity<String>(message, HttpStatus.OK);
		}
		
	}
	
	
	@PostMapping("/addMoneyInAtm")
	public ResponseEntity<?> addMoneyToATM(@RequestBody final AddMoneyReq atm ) {

	
		try {
			String str=atmService.addMoneyFromBank(atm);
			return new ResponseEntity<String>(str, HttpStatus.CREATED);
		} catch (BankException e) {
			message=e.getMessage();
			return new ResponseEntity<String>(message, HttpStatus.OK);
		}
		
	}
	
	@PostMapping("/withdrawAtm")
	public ResponseEntity<?> withdrawFromAtm(@RequestBody final WithrawMoneyReq atm ) {

	
		try {
			String str=atmService.withrawMoney(atm);
			return new ResponseEntity<String>(str, HttpStatus.CREATED);
		} catch (BankException e) {
			message=e.getMessage();
			return new ResponseEntity<String>(message, HttpStatus.OK);
		}
		
	}
}

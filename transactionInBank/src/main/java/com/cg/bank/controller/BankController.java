 package com.cg.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bank.Exception.BankException;
import com.cg.bank.entities.Bank;
import com.cg.bank.service.IBankService;

@RestController
@RequestMapping("/bank")
public class BankController {

	@Autowired
	private IBankService bankService;


	/*
	 * method name : createBank return type : responseEntitiy object parameter :
	 * object of Bank class description : this method will return a created bank
	 * mapping : post
	 */
	@PostMapping("/bankCreate")
	public ResponseEntity<?> createBank(@RequestBody final Bank bank) {

		Bank bank1;
		try {
			bank1 = bankService.createBank(bank);
			return new ResponseEntity<Bank>(bank1, HttpStatus.CREATED);
		} catch (BankException e) {
			String message = e.getMessage();
			return new ResponseEntity<String>(message, HttpStatus.OK);
		}

	}

	/*
	 * method name : retrive return type : responseEntitiy object description : this
	 * method will return a list of created bank mapping : get
	 */
	@GetMapping("/getBankDetails")
	public ResponseEntity<?> retrive() {
		List<Bank> list;
		try {
			list = bankService.getBankDetails();
			return new ResponseEntity<List<Bank>>(list, HttpStatus.OK);
		} catch (BankException e) {
			String message = e.getMessage();
			return new ResponseEntity<String>(message, HttpStatus.OK);
		}

	}

}

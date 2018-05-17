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
	private  String message=null;
	@PostMapping("/bankCreate")
	public ResponseEntity<?> createBank(@RequestBody final Bank bank) {

		Bank bank1;
		try {
			bank1 = bankService.createBank(bank);
			return new ResponseEntity<Bank>(bank1, HttpStatus.CREATED);
		} catch (BankException e) {
			message=e.getMessage();
			return new ResponseEntity<String>(message, HttpStatus.OK);
		}
		

	}

	@GetMapping("/getBankDetails")
	public ResponseEntity<?> retrive() {
		List<Bank> list;
		try {
			list = bankService.getBankDetails();
			return new ResponseEntity<List<Bank>>(list, HttpStatus.OK);
		} catch (BankException e) {
		     message=e.getMessage();	
		     return new ResponseEntity<String>(message, HttpStatus.OK);
		}
		
	}

}

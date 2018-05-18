package com.cg.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bank.Exception.BankException;
import com.cg.bank.entities.Bank;
import com.cg.bank.entities.Transaction;
import com.cg.bank.service.ITransactionService;

@RestController
public class TransactionController {
	@Autowired
	private ITransactionService transactionService;
	private String message;

	/*
	 * method name : retriveTrans return type : responseEntitiy object description :
	 * this method will return a list of transaction mapping : get
	 */
	@GetMapping("/transactionDetails")
	public ResponseEntity<?> retriveTrans() {
		List<Transaction> list;
		try {
			list = transactionService.generateTransactionReport();
			return new ResponseEntity<List<Transaction>>(list, HttpStatus.OK);
		} catch (BankException e) {
			message = e.getMessage();
			return new ResponseEntity<String>(message, HttpStatus.OK);
		}
	}
}

package com.cg.bank.controller;

import java.util.List;
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
import com.cg.bank.entities.Transaction;
import com.cg.bank.service.ITransactionService;
import com.cg.bank.vo.TransactionReq;

@RestController
public class TransactionController {
	@Autowired
	private ITransactionService transactionService;

	/*
	 * method name : retriveTrans return type : responseEntitiy object description :
	 * this method will return a list of transaction mapping : get
	 */
  @GetMapping("/transactionDetails/{accountId}")
	public ResponseEntity<?> retriveTrans(@PathVariable final Long accountId) {
	  
		List<Transaction> list;
		try {
			list = transactionService.generateTransactionReport( accountId);
			return new ResponseEntity<List<Transaction>>(list, HttpStatus.OK);
		} catch (BankException e) {
			String message = e.getMessage();
			return new ResponseEntity<String>(message, HttpStatus.OK);
		}
	}
	
	@PostMapping("/transactionCreate")
	public ResponseEntity<?> createTransaction(@RequestBody final TransactionReq trans) {

		final Transaction transact =trans.getTransaction();
         final  Transaction newtrans;
		try {
			newtrans = transactionService.createTransaction(transact);
			  return new ResponseEntity<Transaction>(newtrans, HttpStatus.CREATED);
		} catch (BankException e) {
			// TODO Auto-generated catch block
			String msg=e.getMessage();
			  return new ResponseEntity<String>(msg, HttpStatus.OK);
		}
        
			
	}
}

package com.cg.bank.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bank.Exception.BankException;
import com.cg.bank.entities.Bank;
import com.cg.bank.entities.Customer;
import com.cg.bank.service.IBankService;
import com.cg.bank.service.ICustomerService;
import com.cg.bank.vo.CreateCustomerRequest;

@RestController
@RequestMapping("/apple")
public class CustomerController {
	@Autowired
	private ICustomerService customerService;
	@Autowired
	private IBankService bankService;

	/*
	 * method name : createCustomer return type : responseEntitiy object parameter :
	 * object of CreateCustomerRequest class description : this method will return a
	 * created customer mapping : post
	 */
	@PostMapping("/customerCreate")
	public ResponseEntity<?> createCustomer(@RequestBody final CreateCustomerRequest createCustomerRequest) {
		Customer response = null;
		Optional<Bank> bank;

		try {
			bank = bankService.getBankDetailsByID(createCustomerRequest.getBankID());

			if (bank.isPresent()) {
				final Customer cust = createCustomerRequest.getCustomer();
				cust.setBank(bank.get());

				try {
					response = customerService.createCustomer(cust);
				} catch (BankException e) {
					String message = e.getMessage();
					return new ResponseEntity<String>(message, HttpStatus.OK);
				}
			}
			return new ResponseEntity<Customer>(response, HttpStatus.CREATED);
		} catch (BankException e1) {
			String message = e1.getMessage();
			return new ResponseEntity<String>(message, HttpStatus.OK);
		}

	}

	/*
	 * method name : getCustomer return type : responseEntitiy object parameter :
	 * path variable id description : this method will return a created customer of
	 * specified id mapping : get
	 */
	@GetMapping("/getCustomerDetails/{id}")
	public ResponseEntity<?> getCustomer(@PathVariable final Long id) {
		final Customer cust;
		try {
			cust = customerService.getCustomerDetails(id);
			return new ResponseEntity<Customer>(cust, HttpStatus.OK);
		} catch (BankException e) {
			String message = e.getMessage();
		
		return new ResponseEntity<String>(message, HttpStatus.OK);
	}
	}
}

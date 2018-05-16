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

import com.cg.bank.entities.Bank;
import com.cg.bank.entities.Customer;
import com.cg.bank.service.IBankService;
import com.cg.bank.service.ICustomerService;
import com.cg.bank.vo.CreateCustomerRequest;

@RestController
public class CustomerController {
	@Autowired
	private ICustomerService customerService;
	@Autowired
	private IBankService bankService;

	@PostMapping("/customerCreate")
	public ResponseEntity<?> createCustomer(@RequestBody final CreateCustomerRequest createCustomerRequest) {
		Customer response;
		Optional<Bank> bank = bankService.getBankDetailsByID(createCustomerRequest.getBankID());
		System.out.println("Optional >>>>" + bank);
		if (bank.isPresent()) {
			Customer cust = createCustomerRequest.getCustomer();
			cust.setBank(bank.get());

			response = customerService.createCustomer(cust);
			return new ResponseEntity<Customer>(response, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<String>("no such bank exsit", HttpStatus.OK);
		}

	}

	@GetMapping("/getCustomerDetails/{id}")
	public ResponseEntity<?> getCustomer(@PathVariable Long id) {
		Customer cust;
		cust = customerService.getCustomerDetails(id);
		return new ResponseEntity<Customer>(cust, HttpStatus.OK);
	}

}

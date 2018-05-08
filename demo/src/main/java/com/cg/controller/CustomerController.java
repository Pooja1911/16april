package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.model.Customer;
import com.cg.service.ICustomerService;

@RestController
public class CustomerController {
 
	@Autowired
	ICustomerService customerService;
	
	@PostMapping("/customerCreate")
	public ResponseEntity<Customer> createCustomer(@RequestBody final Customer customer)
	{
		
		Customer cust=customerService.addCustomer(customer);
		return new ResponseEntity<Customer>(cust,HttpStatus.CONFLICT);
		
	}
	
	@GetMapping("/customerRetrive")
	public ResponseEntity<List<Customer>> retrive()
	{
		List<Customer> list=customerService.retriveCustomer();
		return new ResponseEntity<List<Customer>>(list,HttpStatus.OK);
	}
}

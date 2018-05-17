package com.cg.bank.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bank.Exception.BankException;
import com.cg.bank.entities.Customer;
import com.cg.bank.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements ICustomerService {
	final static Logger LOGGER = LoggerFactory.getLogger(CustomerServiceImpl.class);
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer createCustomer(final Customer customer) throws BankException {
		final Customer custom = customerRepository.save(customer);
		if (custom != null) {
			return custom;
		} else {
			throw new BankException("no customer is created");
		}
	}

	@Override
	public Customer getCustomerDetails(final Long id) throws BankException {

		final Customer customer = customerRepository.findById(id).get();
		if (customer != null) {
			return customer;
		} else {
			throw new BankException("no customer of such id exist");
		}

	}

}

package com.cg.bank.service;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bank.Exception.BankException;
import com.cg.bank.entities.AuditLog;
import com.cg.bank.entities.Customer;
import com.cg.bank.repository.CustomerRepository;

enum EventName {
	CUSTOMER, ACCOUNT, ATM, BANK
}

enum EventType {
	CREATED, UPDATED
}

@Service("customerService")
public class CustomerServiceImpl implements ICustomerService, Cloneable {
	final static Logger LOGGER = LoggerFactory.getLogger(CustomerServiceImpl.class);
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	AuditServiceImpl auditService;

	@Override
	public Customer createCustomer(final Customer customer) throws BankException {
		final Customer custom = customerRepository.save(customer);
		if (custom != null) {
			return custom;
		} else {
			LOGGER.error("No customer is added");
			throw new BankException("no customer is created");
		}
	}

	////
	///
	@Override
	public Customer getCustomerDetails(final Long id) throws BankException {

		final Customer customer = customerRepository.findBycustomerId(id).get();
		if (customer != null) {
			return customer;
		} else {
			LOGGER.info("No customer of given id is exist");
			throw new BankException("no customer of such id exist");
		}

	}

	@Override
	public Customer updateCustomer(final Long id, final String name, final String userId)
			throws BankException, CloneNotSupportedException {
		// TODO Auto-generated method stub
		final Customer customer = customerRepository.findBycustomerId(id).get();

		Customer oldcustmer = customer.clone();

		if (customer != null) {
			customer.setCustomerName(name);
			customer.setUserId(userId);
			Customer cust = customerRepository.save(customer);
			Timestamp time = Timestamp.valueOf(LocalDateTime.now());
			AuditLog audit = new AuditLog(EventName.CUSTOMER.toString(), EventType.UPDATED.toString(), time,
					cust.getUserId(), oldcustmer, cust);

			AuditLog ob = auditService.generateAudit(audit);
			return cust;
		} else {
			LOGGER.info("No customer is updated as id not exist");
			throw new BankException("no customer is updated");
		}

	}

}

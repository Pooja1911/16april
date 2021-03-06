package com.cg.bank.service;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cg.bank.Exception.BankException;
import com.cg.bank.controller.Config;
import com.cg.bank.entities.AuditLog;
import com.cg.bank.entities.Customer;
import com.cg.bank.repository.CustomerRepository;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

enum EventName {
	CUSTOMER, ACCOUNT, ATM, BANK
}

enum EventType {
	CREATED, UPDATED
}

@Service("customerService")
@Component
public class CustomerServiceImpl implements ICustomerService, Cloneable {
	final static Logger LOGGER = LoggerFactory.getLogger(CustomerServiceImpl.class);
	@Autowired
	private CustomerRepository customerRepository;
	/*
	 * @Autowired AuditServiceImpl auditService;
	 */
	@Autowired
	private RabbitTemplate rabbitTemplate;
/*	@Autowired
	private IAuditService auditServcie;*/

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

	//
	///
	public static String fromJavaToJson(AuditLog audit)
			throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper jsonMapper = new ObjectMapper();
		return jsonMapper.writeValueAsString(audit);
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
			Calendar cal = Calendar.getInstance();
			Date time = cal.getTime();

			AuditLog audit = new AuditLog(EventName.CUSTOMER.toString(), EventType.UPDATED.toString(), time,
					cust.getUserId(), oldcustmer, cust);

			// AuditLog ob = auditServcie.createAudit(audit);

			String sendingData = null;
			try {
				sendingData = CustomerServiceImpl.fromJavaToJson(audit);
				rabbitTemplate.convertAndSend(Config.ROUTING_KEY, sendingData);

			} catch (JsonGenerationException e) {
				e.printStackTrace();
			} catch (JsonMappingException e) {
				e.printStackTrace();
			} catch (IOException e) {

				e.printStackTrace();
			}

			return cust;

		} else {
			   LOGGER.info("No customer is updated as id not exist");
			    throw new BankException("no customer is updated");
		}

	}

}

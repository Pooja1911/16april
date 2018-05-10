package com.cg.service;

import java.util.List;
import java.util.Optional;

import org.hibernate.query.criteria.internal.predicate.ExistsPredicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.Exception.ConsumerException;
import com.cg.dao.CustomerRepository;
import com.cg.model.Customer;

@Service("customerService")
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	public CustomerRepository customerRepository;

	@Override
	public Customer addCustomer(Customer customer) throws ConsumerException {
		// TODO Auto-generated method stub
		if (customer != null) {
		Customer custom = customerRepository.save(customer);
		return custom;
		
		} else {
			throw new ConsumerException("Nothing is added");
	
		}
	}

	@Override
	public List<Customer> retriveCustomer() throws ConsumerException {
		// TODO Auto-generated method stub
		List<Customer> list = customerRepository.findAll();
		if (list.isEmpty()) {
			throw new ConsumerException("No matching records are found");
		} else {
			return list;
		}
	}

	@Override
	public Long updateCustomer(Customer customerReq, Long id) throws ConsumerException {
		// TODO Auto-generated method stub
		Optional<Customer> customer = customerRepository.findById(id);
		if (customer.isPresent()) {
			Customer cust = customerRepository.getOne(id);
			if (customerReq.getPaymentMode() != null) {
				cust.setPaymentMode(customerReq.getPaymentMode());
			}
			if (customerReq.getCustomerAddress() != null) {
				cust.setCustomerAddress(customerReq.getCustomerAddress());
			}
			if (customerReq.getCustomerName() != null) {
				cust.setCustomerName(customerReq.getCustomerName());
			}
			if (customerReq.getRetailerName() != null) {
				cust.setRetailerName(customerReq.getRetailerName());
			}

			customerRepository.save(cust);
		} else {
			throw new ConsumerException("Sorry !! such record not exist in database");
		}

		return id;
	}

	@Override
	public void deleteCustomer(Long id) throws ConsumerException {
		// TODO Auto-generated method stub
		Optional<Customer> customer = customerRepository.findById(id);
		if (customer.isPresent()) {
			customerRepository.deleteById(id);
		} else {
			throw new ConsumerException("OOPS! No matching id found!");
		}

	}

	@Override
	public List<Customer> search(String customerName, String customerAddress) throws ConsumerException {
		// TODO Auto-generated method stub
		List<Customer> list = customerRepository.findByCustomerNameAndCustomerAddress(customerName, customerAddress);
		if (list.isEmpty()) {
			throw new ConsumerException("No Matching records found");
		} else {
			return list;
		}

	}

	@Override
	public List<Long> updateMultipleCustomer(List<Customer> customer, List<Long> id) throws ConsumerException {
		// TODO Auto-generated method stub
		return null;
	}

}

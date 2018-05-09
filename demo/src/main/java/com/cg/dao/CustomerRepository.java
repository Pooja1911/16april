package com.cg.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

	public Customer findByCustomerName(String customerName);
	public List<Customer> findByCustomerNameAndCustomerAddress(String customerName,String customerAddress);



}

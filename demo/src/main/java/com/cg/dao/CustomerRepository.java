package com.cg.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
	
	 List<Customer> findByCustomerName(String customerName);

}

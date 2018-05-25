package com.cg.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.bank.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
	

}

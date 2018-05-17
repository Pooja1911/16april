package com.cg.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.bank.entities.Account;
import com.cg.bank.entities.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{

}

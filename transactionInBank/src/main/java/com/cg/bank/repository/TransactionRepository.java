package com.cg.bank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.bank.entities.Account;
import com.cg.bank.entities.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{

	@Query(value="select * from transaction_details where account_account_id=?1",nativeQuery=true)
	List<Transaction> findAllByAccountId(Long accountId);

}

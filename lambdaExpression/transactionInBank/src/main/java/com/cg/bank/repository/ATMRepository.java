package com.cg.bank.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.bank.entities.ATM;
import com.cg.bank.entities.Account;

public interface ATMRepository extends JpaRepository<ATM, Long>{

	Optional<ATM> findByATMId(Long atmId);

}

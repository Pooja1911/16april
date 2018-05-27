package com.cg.bank.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.bank.entities.Bank;
@Repository
public interface BankRepository extends JpaRepository<Bank,Long> {

	Optional<Bank> findBybankId(long iD);

}

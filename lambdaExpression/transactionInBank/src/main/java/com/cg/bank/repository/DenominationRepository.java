package com.cg.bank.repository;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.bank.entities.BankDenomination;

public interface DenominationRepository extends JpaRepository<BankDenomination,BigDecimal>{

	Optional<BankDenomination> findBydenomination(BigDecimal myValue);

}

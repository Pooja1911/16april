package com.cg.bank.repository;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.bank.entities.ATMDenomination;

public interface ATMDenoRepository extends JpaRepository<ATMDenomination, BigDecimal> {

	Optional<ATMDenomination> findBydenomination(BigDecimal myValue);

}

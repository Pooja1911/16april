package com.cg.bank.repository;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.bank.entities.RefMoney;

public interface RefMoneyRepository extends JpaRepository<RefMoney,BigDecimal> {

	Optional<RefMoney> findBydenomination(BigDecimal denomination);

}

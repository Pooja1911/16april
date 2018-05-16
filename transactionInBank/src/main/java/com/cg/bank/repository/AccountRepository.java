package com.cg.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.bank.entities.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

}

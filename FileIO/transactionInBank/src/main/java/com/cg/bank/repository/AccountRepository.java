package com.cg.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.bank.entities.Account;

/**
 * @author trainee
 *
 */
public interface AccountRepository extends JpaRepository<Account, Long>{

}

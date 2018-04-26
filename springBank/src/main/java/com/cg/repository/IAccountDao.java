package com.cg.repository;

import java.util.List;

import com.cg.model.SavingAccount;

public interface IAccountDao {

	List<SavingAccount> addAccount(SavingAccount account);
}

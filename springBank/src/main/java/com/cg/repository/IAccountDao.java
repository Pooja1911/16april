package com.cg.repository;

import java.util.List;

import com.cg.model.SavingAccount;
import com.cg.model.Statment;

public interface IAccountDao {

	List<SavingAccount> addAccount(SavingAccount account);
	List<Statment> addStatement(Statment statment);
}

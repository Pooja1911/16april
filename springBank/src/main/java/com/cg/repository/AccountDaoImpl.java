package com.cg.repository;

import java.util.ArrayList;
import java.util.List;

import com.cg.model.SavingAccount;

public class AccountDaoImpl implements IAccountDao{
          List<SavingAccount> list;
	public List<SavingAccount> addAccount(SavingAccount account) {
		// TODO Auto-generated method stub
		if(this.list==null)
		{
			this.list=new ArrayList<SavingAccount>();
			this.list.add(account);
		}
		else
		{
			this.list.add(account);
		}
		return list;
	}

}

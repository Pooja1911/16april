package com.cg.repository;

import java.util.ArrayList;
import java.util.List;

import com.cg.model.SavingAccount;
import com.cg.model.Statment;

public class AccountDaoImpl implements IAccountDao{
          List<SavingAccount> list;
          List<Statment> statmentList;
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
	@Override
	public List<Statment> addStatement(Statment statment) {
		// TODO Auto-generated method stub
	if(this.statmentList==null)
		{
			this.statmentList=new ArrayList<Statment>();
			statmentList.add(statment);
		return statmentList;
		}
	else
		{			statmentList.add(statment);
		return statmentList;
		
	
		}	
	
	}
	

}

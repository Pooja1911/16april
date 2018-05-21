package com.cg.bank.service;

import com.cg.bank.Exception.BankException;
import com.cg.bank.entities.ATM;
import com.cg.bank.vo.AddMoneyReq;
import com.cg.bank.vo.WithrawMoneyReq;

/**
 * @author Pooja jain
 */
public interface IATMService {
	/**
	 * method name : createATM return type : ATM object parameter :object of ATM
	 * description : this method will return a atm which is created
	 */
	ATM createATM(final ATM atm) throws BankException;

	/**
	 * method name : addMoneyFromBank return type : String parameter :object of
	 * ATMMoneyReq description : this method will return a string if money is added
	 * to atm
	 */
	String addMoneyFromBank(final AddMoneyReq atm) throws BankException;

	/**
	 * method name : withrawMoney return type : String parameter :object of
	 * WithdrawMoneyReq description : this method will return a string if
	 * successfully money withraw
	 */
	Long withrawMoney(final WithrawMoneyReq withdraw) throws BankException;

}

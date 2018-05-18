package com.cg.bank.service;

import com.cg.bank.Exception.BankException;
import com.cg.bank.entities.Customer;

/**
 * @author Pooja Jain
 *
 */
public interface ICustomerService {
	/**
	 * method name : createCustomer return type : customer object parameter
	 * :customerObject description : this method will return a customer which is
	 * created
	 */
	Customer createCustomer(final Customer customer) throws BankException;

	/**
	 * method name : getCustomerDetails return type : Customer object parameter
	 * :Long description : this method will return a customer of specified id
	 */
	Customer getCustomerDetails(final Long id) throws BankException;

}

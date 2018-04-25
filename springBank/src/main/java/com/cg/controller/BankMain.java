package com.cg.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.model.Address;
import com.cg.model.Bank;
import com.cg.model.Contact;
import com.cg.model.Customer;
import com.cg.model.SavingAccount;
import com.cg.service.AccountServiceImpl;
import com.cg.service.BankServiceImpl;
import com.cg.service.ContactServiceImpl;
import com.cg.service.CustomerServiceImpl;
import com.cg.service.IAccountService;
import com.cg.service.IBankService;
import com.cg.service.IContactService;
import com.cg.service.ICustomerService;



public class BankMain {
	final static Logger LOGGER = Logger.getLogger(BankMain.class.getName());

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		 ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		 
		//to add a bank
		 Bank bank=ctx.getBean("bank", Bank.class);
		List<Bank> banklist=new ArrayList<Bank>();
		IBankService bankService=ctx.getBean("bankService",BankServiceImpl.class);
		banklist=bankService.addBank(bank);

		
		
	 //to add customer
	 Customer customer=ctx.getBean("customer", Customer.class);
		List<Customer> customerlist=new ArrayList<Customer>();
		
		ICustomerService customerService=ctx.getBean("customerService", CustomerServiceImpl.class);
		customerlist=customerService.addCustomer(customer);
	//	LOGGER.info("cust"+customer);
		
		
		//to add Customer contact and Address details
		Address address=ctx.getBean("address",Address.class);
		Contact contact=ctx.getBean("contact",Contact.class);
		List<Contact> contactlist=new ArrayList<Contact>();
		IContactService contactService=ctx.getBean("contactService",ContactServiceImpl.class);
		contactlist=contactService.addContact(contact);
		
		//saving Account
		//to deposit an amount
		 SavingAccount savingAccount=ctx.getBean("savingAccount", SavingAccount.class);
		LOGGER.info("Enter the amount you want to enter");
		float depositAmount=scan.nextFloat();
		List<SavingAccount>savinglist=new ArrayList();
		
		IAccountService accountService=ctx.getBean("accountService", AccountServiceImpl.class);
		savinglist=accountService.deposit(depositAmount);
		LOGGER.info("list"+savinglist);
		
		
		//to withdraw an amount
		LOGGER.info("Enter the amount you want to enter");
		float withdrawAmount=scan.nextFloat();
	     savinglist=accountService.withdraw(withdrawAmount);
	     LOGGER.info("list"+savinglist);
		
		//to print statement of savingAccount
	     List<SavingAccount> list=new ArrayList();
	    
	     list.addAll(savinglist);
	    LOGGER.info("Size of list"+ list.size());
	  
	}

}

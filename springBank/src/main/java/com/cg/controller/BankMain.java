package com.cg.controller;

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
import com.cg.model.Statment;
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
		final Scanner scan = new Scanner(System.in);

		final ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		/*
		 * project name: SpringBank method name: addBank(String name) method
		 * description: it will add multiple bank
		 */
		final Bank bank = ctx.getBean("bank", Bank.class);
		List<Bank> banklist;
		final IBankService bankService = ctx.getBean("bankService", BankServiceImpl.class);
		banklist = bankService.addBank(bank);

		/*
		 * project name: SpringBank method name: addCustomer(Customer customer) method
		 * description: it will add multiple customer in a bank
		 */
		//final Customer customer = ctx.getBean("customer1", Customer.class);
		//List<Customer> customerlist;

		ICustomerService customerService = ctx.getBean("customerService", CustomerServiceImpl.class);
         final Customer customer1 = (Customer )ctx.getBean("customer1");
		
		//System.out.println("new customer "+customer1);

		customerService = ctx.getBean("customerService", CustomerServiceImpl.class);
		 List<Customer> customerlist1 = customerService.addCustomer(customer1);
		System.out.println("new list "+customerlist1);
		//customerlist = customerService.addCustomer(customer);

		/*
		 * project name: SpringBank method name: addContact(Contact contact) method
		 * description: it will add contact details along with address details
		 */
		final Address address = ctx.getBean("address", Address.class);
		final Contact contact = ctx.getBean("contact", Contact.class);
		final IContactService contactService = ctx.getBean("contactService", ContactServiceImpl.class);
		List<Contact> contactlist = contactService.addContact(contact);

		/*
		 * project name: SpringBank method name: deposit(float SavingAccount) method
		 * description: it will deposit some amount to a savingAccount
		 */
		SavingAccount savingAccount = ctx.getBean("savingAccount", SavingAccount.class);
		System.out.println("Enter the amount to deposit");
		 final float depositAmount = scan.nextFloat();
		IAccountService accountService = ctx.getBean("accountService", AccountServiceImpl.class);
		savingAccount = accountService.deposit(depositAmount, customer1);
		System.out.println(savingAccount.getBalance());

		/*
		 * project name: SpringBank method name: withdraw(float,Object of SavingAccount)
		 * method description: it will withdraw some valid amount from the account
		 * balance
		 */
		System.out.println("Enter the amount you want to withdraw");
		final float withdrawAmount = scan.nextFloat();
		savingAccount = accountService.withdraw(withdrawAmount, customer1);
		LOGGER.info("" + savingAccount.getBalance());
		
		SavingAccount account=ctx.getBean("account",SavingAccount.class);
		IAccountService accountService1=ctx.getBean("accountService1",AccountServiceImpl.class);
		List<SavingAccount>addAccount=accountService1.addAccount(account);
		System.out.println("my account"+account);
		/*
		 * project name: Spring 
           method name: update(float,Object of SavingAccount)
		 * method description: it will update customer details
		 * 
		 */
		Statment statment = ctx.getBean("statment", Statment.class);
		Statment statment1 = ctx.getBean("statment1", Statment.class);
		LOGGER.info("Add Statment");
		List<Statment> statList=accountService1.addStatement(statment);
		statList=accountService1.addStatement(statment1);
		System.out.println(""+statList);
		/*
		 * project name: SpringBank
           method name: update(float,Object of SavingAccount)
		 * method description: it will update customer details
		 * 
		 */
	
          LOGGER.info("Enter customerId");
          Integer custId=scan.nextInt();
          LOGGER.info("Enter the email you want to update");
          String update=scan.next();
		customerService.updateDetails(customer1, update, custId);
		System.out.println(customer1);
		/*
		 * project name: SpringBank
           method name: delete(float,Object of SavingAccount)
		 * method description: it will delete account details
		 * 
		 */
		
		LOGGER.info("Enter your customer id");
		custId=scan.nextInt();
		accountService.deleteAccount(customer1, custId);
		System.out.println(customer1);
       
		
		
	}

}

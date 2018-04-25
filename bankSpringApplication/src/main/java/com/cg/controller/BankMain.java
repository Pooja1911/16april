package com.cg.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

import com.cg.model.Address;
import com.cg.model.Bank;
import com.cg.model.Contact;
import com.cg.model.Customer;
import com.cg.service.BankServiceImpl;
import com.cg.service.ContactServiceImpl;
import com.cg.service.CustomerServiceImpl;
import com.cg.service.IBankService;
import com.cg.service.IContactService;
import com.cg.service.ICustomerService;



public class BankMain {
	final static Logger LOGGER = Logger.getLogger(BankMain.class.getName());

	public static void main(String[] args) {
		//to add a bank
		Scanner scan=new Scanner(System.in);
		LOGGER.info("Enter the name of bank");
		String bankName=scan.next();
		Bank bank=new Bank(bankName);
		List<Bank> banklist=new ArrayList<Bank>();
		IBankService bankService=new BankServiceImpl();
		banklist=bankService.addBank(bank);
		
		
	// to add customer
		LOGGER.info("Enter Details of customer");
		LOGGER.info("Enter your first name");
		String firstName=scan.next();
		LOGGER.info("Enter your last name");
		String lastName=scan.next();
		Customer customer=new Customer(firstName,lastName);
		List<Customer> customerlist=new ArrayList<Customer>();
		ICustomerService customerService=new CustomerServiceImpl();
		customerlist=customerService.addCustomer(customer);
		
		
		//to add Customer contact and Address details
		LOGGER.info("Enter your Address Details");
		LOGGER.info("Enter your Street name");
		String street=scan.next();
		LOGGER.info("Enter your house number");
		String houseNumber=scan.next();
		LOGGER.info("Enter your Zip Code");
		String zipcode=scan.next();
		LOGGER.info("Enter your City name");
		String city=scan.next();
		Address address=new Address(street,houseNumber,zipcode,city);
		
		LOGGER.info("Enter your mobile number");
		long phone=scan.nextLong();
		LOGGER.info("Enter your phone number");
		long mobile=scan.nextLong();
		LOGGER.info("Enter your email id");
		String email=scan.nextLine();
		Contact contact=new Contact(phone,mobile,email,address);//adding contact aND ADDRESS
		List<Contact> contactlist=new ArrayList<Contact>();
		IContactService contactService=new ContactServiceImpl();
		contactlist=contactService.addContact(contact);
		
		
		
		
	}

}

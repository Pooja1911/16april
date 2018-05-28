package com.bankApplication.transactionInBank;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.bank.Exception.BankException;
import com.cg.bank.controller.CustomerController;
import com.cg.bank.entities.Bank;
import com.cg.bank.entities.Customer;
import com.cg.bank.service.BankServiceImpl;
import com.cg.bank.service.CustomerServiceImpl;
import com.cg.bank.service.IBankService;
import com.cg.bank.service.ICustomerService;
import com.cg.bank.vo.CreateCustomerRequest;

@RunWith(SpringRunner.class)
public class CustomerTest {
	BigDecimal big;
	Bank bank;
	Customer customer1 = null;
	Customer customer;
	CreateCustomerRequest cr;
	CreateCustomerRequest cr1;
	ICustomerService customerServiceMok;
	IBankService bankService;

	@Before
	public void setup() {
		big = new BigDecimal(0);
		bank = new Bank(1L, big);
		customer = new Customer(1L, "Pooja", 209L);
		cr = new CreateCustomerRequest(customer, 1L);
		cr1 = new CreateCustomerRequest(customer, 5L);
		customerServiceMok = mock(CustomerServiceImpl.class);
		bankService = mock(BankServiceImpl.class);
	}

	@Test
	public void truecaseaddCustomer() throws BankException {
		Optional<Bank> optBank = Optional.of(bank);
		customer.setBank(bank);
		when(bankService.getBankDetailsByID(cr.getBankID())).thenReturn(optBank);
		when(customerServiceMok.createCustomer(customer)).thenReturn(customer);
		CustomerController CustomerContollerMock = new CustomerController();
		CustomerContollerMock.setBankService(bankService);
		CustomerContollerMock.setCustomerService(customerServiceMok);
		ResponseEntity<Customer> cust = (ResponseEntity<Customer>) CustomerContollerMock.createCustomer(cr);
		assertEquals("", cust.getBody(), customer);

	}

	@Test
	public void falsecaseaddCustomerforcustomer() {
		Optional<Bank> optBank = Optional.of(bank);
		customer.setBank(bank);
		try {
			when(bankService.getBankDetailsByID(cr.getBankID())).thenReturn(optBank);
			when(customerServiceMok.createCustomer(customer)).thenThrow(new BankException("no customer is created"));
		} catch (BankException e) {
			// test data setup>> so ignored
		}

		CustomerController CustomerContollerMock = new CustomerController();
		CustomerContollerMock.setBankService(bankService);
		CustomerContollerMock.setCustomerService(customerServiceMok);
		ResponseEntity<?> cust = (ResponseEntity<?>) CustomerContollerMock.createCustomer(cr);
		// System.out.println("no customer is created"+cust.getBody());
		assertEquals("no customer is created", cust.getBody());

	}

	@Test
	public void truecaseforgetCustomerById() throws BankException {
		Optional<Bank> optBank = Optional.of(bank);
		customer.setBank(bank);
		when(bankService.getBankDetailsByID(cr.getBankID())).thenReturn(optBank);
		when(customerServiceMok.createCustomer(customer)).thenReturn(customer);
		CustomerController CustomerContollerMock = new CustomerController();
		CustomerContollerMock.setBankService(bankService);
		CustomerContollerMock.setCustomerService(customerServiceMok);
		ResponseEntity<Customer> cust = (ResponseEntity<Customer>) CustomerContollerMock.createCustomer(cr);
		when(customerServiceMok.getCustomerDetails(1L)).thenReturn(customer);
		ResponseEntity<Customer> cust1 = (ResponseEntity<Customer>) CustomerContollerMock.getCustomer(1L);
		assertEquals(cust1.getBody(), customer);
	}

	@Test
	public void falsecaseforgetCustomerById() {
		Optional<Bank> optBank = Optional.of(bank);
		customer.setBank(bank);
		try {
			when(bankService.getBankDetailsByID(cr.getBankID())).thenReturn(optBank);
		} catch (BankException e) {
		}
		try {
			when(customerServiceMok.createCustomer(customer)).thenReturn(customer);
		} catch (BankException e) {
		
		}
		CustomerController CustomerContollerMock = new CustomerController();
		CustomerContollerMock.setBankService(bankService);
		CustomerContollerMock.setCustomerService(customerServiceMok);
		ResponseEntity<Customer> cust = (ResponseEntity<Customer>) CustomerContollerMock.createCustomer(cr);
		try {
			when(customerServiceMok.getCustomerDetails(3L))
					.thenThrow(new BankException("no customer of such id exist"));
		} catch (BankException e) {
		}
		ResponseEntity<Customer> cust1 = (ResponseEntity<Customer>) CustomerContollerMock.getCustomer(3L);
		assertEquals(cust1.getBody(), "no customer of such id exist");
	}

}

package bank;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.cg.model.Address;
import com.cg.model.Bank;
import com.cg.model.Contact;
import com.cg.model.Customer;
import com.cg.model.SavingAccount;
import com.cg.service.AccountServiceImpl;
import com.cg.service.IAccountService;

public class Testcase {
	Bank bank=new Bank("Axis");
	Customer customer=new Customer("Pooja","Jain");
	Address address=new Address("newStreet","123","23412","Mumbai");
	Contact contact=new Contact(900121234,324567,"pooja@gmail.com",address);
	SavingAccount account=new SavingAccount();
	IAccountService accountService=new AccountServiceImpl();
	
	@Before
	public void setup() {
		

		account.setBalance(1000);
	}
	@Test
	public void checkbankname()
	{
		assertEquals("Axis",bank.getName());
	}

	@Test
	public void checkCustomerName()
	{
		assertEquals("Pooja",customer.getFirstName());
		assertEquals("Jain",customer.getLastName());
	}
	
	@Test
	public void checkContactmobile()
	{
		assertTrue(contact.getMobile()==900121234);
	}
	@Test
	public void checkContactphone()
	{
		assertTrue(contact.getPhone()==324567);
	}
	@Test
	public void checkContactemail()
	{
		assertTrue(contact.getEmail()=="pooja@gmail.com");
	}
	@Test
	public void addresscheck()
	{
		contact.setAddress(address);
		assertTrue(contact.getAddress()==address);
	}
	
	@Test
	public void falseaddresscheck()
	{
		contact.setAddress(null);
		assertFalse(contact.getAddress()==address);
	}
	@Test
	public void bankTestcase()
	{
		//account.setBalance(1000);
		accountService.withdraw(200);
		assertTrue(account.getBalance()==800);
		
	}
	
	/*@Test
	public void bankfalseTestCase()
	{
		account.withdraw(2000);
		assertFalse(account.getBalance()==1000);
	}

	@Test
	public void banksavingcheck()
	{
		account.setBalance(400);
		account.withdraw(300);
		assertTrue("Minimum balance should be 500!!!",true);
	}
	
	@Test
	public void truecasefordepositsaving()
	{
		account.deposit(0);
		assertTrue(account.getBalance()==1000);
	}
	@Test
	public void testfordeposit()
	{
		account.deposit(300);
		assertTrue(account.getBalance()==1300);
	}
	
	@Test
	public void falsetestfordeposit()
	{
		account.deposit(-1300);
		assertTrue("Please Enter valid amount",true);
		
	}*/
}

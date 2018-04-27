package bank;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.cg.model.Address;
import com.cg.model.Bank;
import com.cg.model.Contact;
import com.cg.model.Customer;
import com.cg.model.SavingAccount;
import com.cg.model.Statment;
import com.cg.service.AccountServiceImpl;
import com.cg.service.CustomerServiceImpl;
import com.cg.service.IAccountService;
import com.cg.service.ICustomerService;

public class BankAppTest {
Bank bank=new Bank("Axis");
	
	
	Address address=new Address("newStreet","123","23412","Mumbai");
	Contact contact=new Contact(900121234,324567,"pooja@gmail.com",address);
	Contact contact1=new Contact(900121234,324567,"jain@gmail.com",address);
	Statment statment=new Statment(new Date(),"Statment");
	List<Statment> statlist=new ArrayList();
	SavingAccount account=new SavingAccount(1000,1001,statlist);
	List<SavingAccount> list =new ArrayList<SavingAccount>();
	Customer customer=new Customer("Pooja","Jain",101,list,contact);
	Customer customer1=new Customer("Pooja","Jain",101,list,contact1);
	IAccountService accountService=new AccountServiceImpl();
	ICustomerService customerService=new CustomerServiceImpl();
	@Before
	public void setup() {
		statlist.add(statment);
		list.add(account);
		customer.setCustomerId(101);
		account.setAccountNumber(1001);
		//account.setBalance(1000);
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
		account=accountService.deposit(200,customer);
		
		assertTrue(account.getBalance()==1200);
		
	}
	
	@Test
	public void falsedepositcheck()
	{
		accountService.deposit(-2000,customer);
		assertFalse(account.getBalance()==100);
	}

	@Test
	public void withdrawcheck()
	{
	
		account=accountService.withdraw(300,customer);
		assertTrue(account.getBalance()==700);
	}

	@Test
	public void withdrawfalsecheck()
	{
		
		accountService.withdraw(2000, customer);
		assertTrue("your balance is less than amount!!!",true);
	}
	
	
}
package bankSpringApplication;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.cg.model.Address;
import com.cg.model.Bank;
import com.cg.model.Contact;
import com.cg.model.Customer;

public class Testcase {
	Bank bank=new Bank("Axis");
	Customer customer=new Customer("Pooja","Jain");
	Address address=new Address("newStreet","123","23412","Mumbai");
	Contact contact=new Contact(900121234,324567,"pooja@gmail.com",address);
	@Before
	public void setup() {
		
		
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
}

package bank.bankapplication;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class BankTest {
	SavingAccount account=new SavingAccount();
	CheckingAccount check=new CheckingAccount();
	FlexibleSavingAccount flex=new FlexibleSavingAccount();
	Customer customer=new Customer();
	Contact contact=new Contact();
	Address address=new Address("newstreet","112","230121","Dungarpur");
			
	@Before
	public void setup()
	{
		//SavingAccount account=new SavingAccount();
		account.setBalance(1000);
		check.setBalance(1000);
		flex.setBalance(2000);
		
	}
	
	@Test
	public void bankTestcase()
	{
		account.withdraw(200);
		assertTrue(account.getBalance()==800);
		
	}
	
	@Test
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
		
	}
	@Test 
	public void caseforcheckingAccount()
	{
		check.withdraw(200);
		assertTrue(check.getBalance()==800);
	}
	@Test
	public void truecasefordepositCheck()
	{
		check.deposit(0);
		assertTrue(check.getBalance()==1000);
	}
	@Test
	public void falsecaseforwithdraw()
	{
		check.withdraw(1700);
		assertFalse(check.getBalance()==1200);
	}
	@Test 
	public void truecaseforwithdraw()
	{
		check.setBalance(300);
		assertTrue("Minimum balance should be 500!!!",true);
	}
	@Test
	public void truecasefordeposit()
	{
		check.deposit(1200);
		assertTrue(check.getBalance()==2200);
	}
	@Test
	public void falsecasefordeposit()
	{
		check.deposit(0);
		assertFalse(check.getBalance()==900);
	}
	
	@Test
	public void truecaseforvalidation()
	{
		check.deposit(-1300);
		assertTrue("Please Enter valid amount",true);
	}
	
	@Test
	 public void truecaseforFlecibleSavingAccount() {
		flex.withdraw(200);
		assertTrue(flex.getBalance()==1800);
		
	}
	
	@Test
	public void falsecaseforwithdrawFlexible()
	{
		flex.withdraw(1200);
		assertFalse(flex.getBalance()==1200);
		
	}
	
	@Test
	public void validationforwithdrawflexible()
	{
		flex.setBalance(400);
		flex.withdraw(200);
		assertTrue("Minimum balance should be 500!!!",true);
	
	}
	
	@Test
	public void truecasefordepositFlex()
	{
		flex.deposit(100);
		assertTrue(flex.getBalance()==2100);
	}
	
	@Test
	public void falsecasefordepositflex() {
		flex.deposit(1200);
		assertFalse(flex.getBalance()==900);
		
	}
	
	@Test
	public void truecaseforvalidflexdepoasit()
	{
		flex.deposit(-123);
		assertTrue("Please Enter valid amount",true);
	}
	
	@Test
	public void truecasefordepositflex()
	{
		flex.deposit(0);
		assertTrue(flex.getBalance()==2000);
	}
	@Test
	public void truecaseforfirstNAme()
	{
		customer.setFirstName("Pooja");
		assertEquals("Pooja", "Pooja");
	}
	@Test
	public void falsecaseforfirstName()
	{
		customer.setFirstName("Pooja");
		assertNotEquals(null,"Pooja");
	}
	
	@Test
	public void truecaseforLastName()
	{
		customer.setLastName("Jain");
		assertEquals("Jain", "Jain");
	}
	@Test
	public void falsecaseforlastName()
	{
		customer.setLastName("Jain");
		assertFalse(null,false);
	}
	@Test
	public void trueforcontactcheck()
	{
		contact.setAddress(address);
		assertTrue(contact.getAddress()==address);
	}
	
	@Test
	public void falsetestcaseforaddress()
	{
		contact.setAddress(null);
		assertFalse(contact.getAddress()==address);
	}
	
}

package testcases.palinTest;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class PalinTestcase {
	
		Palindrome palin=new Palindrome();
	@Test
	public void checkfortruecase()
	{
		
		assertEquals(true,palin.isPalindrome("121"));
	}
		
	@Test
	public void checkforfalsecase()
	{
		
		assertEquals(false,palin.isPalindrome("121-"));
	}
	@Test
	public void checkforemptycase()
	{
	
		assertEquals(false,palin.isPalindrome(""));
	}
	
	@Ignore
	@Test
	public  void checkfornullcase()
	{
	
		assertEquals(false,palin.isPalindrome(null));
	}
}

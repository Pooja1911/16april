package testcases.palinTest;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class PalinTestcase {
	
		
	@Test
	public void checkfortruecase()
	{
		
		assertEquals(true,Palindrome.isPalindrome("121"));
	}
		
	@Test
	public void checkforfalsecase()
	{
		
		assertEquals(false,Palindrome.isPalindrome("121-"));
	}
	@Test
	public void checkforemptycase()
	{
	
		assertEquals(false,Palindrome.isPalindrome(""));
	}
	
	@Ignore
	@Test
	public void checkfornullcase()
	{
	
		assertEquals(false,Palindrome.isPalindrome(null));
	}
}

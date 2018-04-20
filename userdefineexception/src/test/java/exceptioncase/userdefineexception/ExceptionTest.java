package exceptioncase.userdefineexception;



import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ExceptionTest {
 
	 private CustomException custom=null;
	 @Before
	 public void setup()
	 {
		 custom=new CustomException();
	 }
	@Test(expected=InvalidInputException.class)
	public void exceptioncheck() throws InvalidInputException
	{
		//assertEquals("java.lang.Exception:number and power cannot be zero",custom.power(0, 0));
		custom.power(0, 0);
	}
	
	
	@Test(expected=InvalidInputException.class)
	public void exceptionfalsecheck() throws InvalidInputException
	{
		//assertEquals("java.lang.Exception:number and power cannot be zero",custom.power(0, 0));
		custom.power(-1,-3);
	}
}

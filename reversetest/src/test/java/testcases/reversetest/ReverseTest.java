package testcases.reversetest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotSame;


import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class ReverseTest {
	
	ReverseString rs = new ReverseString();
	
	@Test
	public void truereversecase()
	{
	 assertEquals("ih olleh",rs.isReverseString("hello hi"));
	}
   
	@Test
	public  void falsereversecase()
	{
		
//		assertNotEqual( "","ih olle", ReverseString.isReverseString("hello hi"));
		assertNotSame("", "", rs.isReverseString("hello hi"));
	}
}

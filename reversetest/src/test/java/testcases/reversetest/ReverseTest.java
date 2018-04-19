package testcases.reversetest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Ignore;
import org.junit.Test;

public class ReverseTest {
	@Test
	public void truereversecase()
	{
	 assertEquals("ih olleh",ReverseString.isReverseString("hello hi"));
	}
    @Ignore
	@Test
	public void falsereversecase()
	{
		
		assertNotEquals("test", "hhhh", ReverseString.isReverseString("hello hi"));
	}
}

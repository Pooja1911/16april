package testcases.duplicatetest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestString {
	StringDuplicate duplicate=new StringDuplicate();
	@Test
	public void truetestcase()
	{
		assertTrue(duplicate.isStringDuplicate("pooja"));
	}
     
	@Test
	public void falsetestcase()
	{
		assertFalse(duplicate.isStringDuplicate("jain"));
	}
}

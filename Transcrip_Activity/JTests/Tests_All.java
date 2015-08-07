import static org.junit.Assert.*;

import org.junit.Test;


public class Tests_All {
	@Test
	public void Test_Course_CORRECT_iNPUT()
	{
		assertTrue(Validator.validate_Course("MATH 101"));		
	}
	
	@Test
	public void Test_Course_2()
	{
		assertFalse(Validator.validate_Course("115."));
	}
	
	@Test
	public void Test_Course_3()
	{
		assertFalse(Validator.validate_Course(" "));
	}
	
	@Test
	public void Test_Course_4()
	{
		assertFalse(Validator.validate_Course("."));
	}
	
	@Test
	public void Test_Course_5()
	{
		assertFalse(Validator.validate_Course(null));
	}
	
	//TEST GRADES
	
	@Test
	public void Test_Grade()
	{
		assertFalse(Validator.validate_Grade(""));
	}
	@Test
	public void Test_Grade2()
	{
		assertFalse(Validator.validate_Grade(" "));
		assertFalse(Validator.validate_Grade(null));
	}
	@Test
	public void Test_Grade3()
	{
		assertFalse(Validator.validate_Grade("DFSGDSFG"));
	}
	@Test
	public void Test_Grade4()
	{
		assertFalse(Validator.validate_Grade("123"));
	}
	
	@Test
	public void Test_Grade5()
	{
		assertTrue(Validator.validate_Grade("A"));
	}
	@Test
	public void Test_Grade6()
	{
		assertTrue(Validator.validate_Grade("a"));
	}

	
	//TEST CREDITS
	@Test
	public void Test_Credits()
	{
		assertFalse(Validator.validate_Credits(""));
	}
	@Test
	public void Test_Credits2()
	{
		assertFalse(Validator.validate_Credits(null));
	}
	@Test
	public void Test_Credits3()
	{
		assertTrue(Validator.validate_Credits("12"));
	}
	@Test
	public void Test_Credits4()
	{
		assertTrue(Validator.validate_Credits("12.5"));
	}
	
	
	
}
	
	

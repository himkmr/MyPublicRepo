import static org.junit.Assert.*;

import org.junit.Test;


public class Tests_All {
	@Test
	public void Test_Price()
	{
		assertTrue(Validator.validate_Price("115.045"));
		assertFalse(Validator.validate_Price("115."));
		assertFalse(Validator.validate_Price("115..."));
		assertFalse(Validator.validate_Price("."));
		assertFalse(Validator.validate_Price(".4545"));
	}
	
	@Test
	public void Test_code()
	{
		assertFalse(Validator.validate_Code(""));
		assertFalse(Validator.validate_Code(null));
	}
	
	@Test
	public void Test_Quantity()
	{
		assertFalse(Validator.validate_Quantity(""));
		assertFalse(Validator.validate_Quantity(null));
		assertTrue(Validator.validate_Quantity("12"));
		assertFalse(Validator.validate_Quantity("12.5"));
	}
}
	
	

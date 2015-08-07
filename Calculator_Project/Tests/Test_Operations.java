import static org.junit.Assert.*;

import org.junit.Test;

public class Test_Operations {

	@Test
	public void Test1()
	{
		Calculator c = new Calculator();
		int a=10, b=10;
		assertTrue("Addition is not good",(c.add(a,b)== (a+b)));		
	}
	@Test
	public void Test2()
	{
		Calculator c = new Calculator();
		int a=10, b=10;
		assertTrue("Subtraction is not good",(c.subtract(a,b)== (a-b)));		
	}
	@Test
	public void Test3()
	{
		Calculator c = new Calculator();
		int a=10, b=10;
		assertTrue("Multiplication is not good",(c.multiply(a,b)== (a*b)));		
	}
	@Test
	public void Test4()
	{
		Calculator c = new Calculator();
		int a=10, b=10;
		assertTrue("Division is not good",(c.divide(a,b)== (a/b)));		
	}
}

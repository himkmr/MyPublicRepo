import static org.junit.Assert.*;

import org.junit.Test;

public class Test2 {
	@Test
	public void test() {
		Book b = new Book();
		assertTrue(b.getPrice()==100);
	}

	@Test
	public void test2() {
		Book b = new Book();
		assertEquals(b.getCode(), "book");
	}
}

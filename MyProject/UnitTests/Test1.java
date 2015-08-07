import static org.junit.Assert.*;
import org.junit.Test;


public class Test1 {

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
	
	@Test
	public void test3() {
		Book b = new Book();
		assertEquals(b.getDescription(), "desc");
	
	}
}

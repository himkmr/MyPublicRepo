
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Book b = new Book();
		b.setDescription("mybook");
		b.setAuthor("Himanshu");
		b.setPages(1212);
		b.setPrice(100);
		b.setCode("book");
	
		Software sf = new Software();
		sf.setDescription("Software");
		sf.setOs("Windows");
		sf.setPlatform("All");
		sf.setProgrammer("Himanshu");
		sf.setPrice(100);
		sf.setCode("soft");
		System.out.println(sf.toString() +"\n");
		System.out.println(b.toString());
		
	}

}

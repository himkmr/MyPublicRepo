
public class BookDB {

	public static Book getBook(String book_code){

		Book book_obj = new Book();
		//set book title
		book_obj.set_Book_Code(book_code);
		
		if(book_code.equalsIgnoreCase("java"))
		{
			book_obj.set_Title("Introduction to java");
			book_obj.set_Author("James Gosling");
			book_obj.set_Description("Basics of Java Programming");
			book_obj.set_Price(100);
			book_obj.set_isInStock(true);
		}
		
		else if(book_code.equalsIgnoreCase("jsp"))
		{
			book_obj.set_Title("JSP is Everywhere");
			book_obj.set_Author("Kathy Sierra");
			book_obj.set_Description("Basics of Java Server Pages");
			book_obj.set_Price(150);
			book_obj.set_isInStock(true);
		}
		
		else if(book_code.equalsIgnoreCase("EJB"))
		{
			book_obj.set_Title("Introduction to Enterprise Java Beans");
			book_obj.set_Author("Himanshu Verma");
			book_obj.set_Description("Basics of Enterprise Java Beans");
			book_obj.set_Price(200);
			book_obj.set_isInStock(true);
		}
		
		return book_obj;
	}

}

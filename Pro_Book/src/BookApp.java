import java.util.Scanner;


public class BookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Book Selector");
		System.out.println("Enter Book Code: java/ jsp / EJB ?   ");
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			String code = sc.next();
			Book b = BookDB.getBook(code);
			System.out.println("Author : "+b.get_Author());
			System.out.println("Description : "+b.get_Description());
			System.out.println("Title : "+b.get_Title());
			System.out.println("Price : $"+b.get_Price());
			System.out.println("Is in Stock? "+b.get_isInStock());
			
			
			System.out.println("Do you want to continue?   (y/n) ");
			String proceed = sc.next();
			if(proceed.equals("y"))
				System.out.println("Enter Book Code: java/ jsp / EJB ?   ");
			else
				break;
				
		}
		
	
	
	}

}

import java.util.ArrayList;
import java.util.Scanner;


public class InvoiceApp {

	static class Java_item			//nested class, used for a Data Structure, creating an ArrayList of this type
	{								//not needed unless keeping track  of each item
		public Java_item(String quantity2, String price2) {
			quantity = Integer.parseInt(quantity2);
			price = Double.parseDouble(price2);
		}
		int quantity;
		Double price;
	}
	
	static class Jsp_item			//nested class, used for a data Structure, creating an ArrayList of this type
	{								//not needed unless keeping track  of each item
		public Jsp_item(String quantity2, String price2) {
			quantity = Integer.parseInt(quantity2);
			price = Double.parseDouble(price2);
		}
		int quantity;
		Double price;
	}



	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Invoice inv = new Invoice();

		ArrayList<Java_item> javalist = new ArrayList<Java_item>();
		ArrayList<Jsp_item> jsplist = new ArrayList<Jsp_item>();
		while(true)
		{
			System.out.println("Enter Item code:  or QUIT to quit anytime");
			String code = sc.nextLine();
			if(code.equalsIgnoreCase("quit"))
					System.exit(1);
			while(!Validator.validate_Code(code))
			{
				System.out.println("Enter Item code");
				code = sc.nextLine();
				if(code.equalsIgnoreCase("quit"))
					System.exit(1);
				
			}
			
			
			
			System.out.println("Enter Quantity");
			String quantity = sc.nextLine();
			if(quantity.equalsIgnoreCase("quit"))
					System.exit(1);
			
			while(!Validator.validate_Quantity(quantity))
			{
				System.out.println("Enter Item quantity");
				quantity = sc.nextLine();
				if(quantity.equalsIgnoreCase("quit"))
					System.exit(1);
				
			}
			
			
			
			System.out.println("Enter Price");
			String price = sc.nextLine();
			if(price.equalsIgnoreCase("quit"))
					System.exit(1);
			while(!Validator.validate_Price(price))
			{
				System.out.println("Enter Item price");
				price= sc.nextLine();
				if(price.equalsIgnoreCase("quit"))
					System.exit(1);
				
			}
			
			//add to respective lists, to calculate avergae later
			if(code.equalsIgnoreCase("java"))
				javalist.add(new Java_item(quantity, price));
			else
				jsplist.add(new Jsp_item(quantity, price));
			
			inv.add_Item(code, Integer.parseInt(quantity), Double.parseDouble(price));
			System.out.println("Continue? : (y/n)");
			
			String cont = sc.nextLine();
			if(!(cont.equalsIgnoreCase("y")))
				break;
				
		}
		inv.printInvoice();
		System.out.println("\n");
		System.out.println("                INVOICE TOTAL   "+inv.getInvoiceTotal());
		System.out.println("\n\n");
		//calculate average and print
		{
			double price_java=0;
			int quantity_java = 0;
			double price_jsp=0;
			int quantity_jsp = 0;
			double java_avg = 0;
			double jsp_avg = 0;
			for(Java_item elem:javalist)
			{
				price_java+=elem.price*elem.quantity;
				quantity_java+=elem.quantity;
				
			}
			java_avg = price_java/quantity_java;
			for(Jsp_item elem:jsplist)
			{
				price_jsp+=elem.price*elem.quantity;
				quantity_jsp+=elem.quantity;
			}
			jsp_avg = price_jsp / quantity_jsp;
			System.out.println("Java: Quantity: "+quantity_java+"   Total Price: "+ price_java+"  Average Price: "+java_avg);		
			System.out.println("JSP: Quantity: "+quantity_jsp+"   Total Price: "+ price_jsp+"  Average Price: "+jsp_avg);
			
			
		}
		
		
		
		sc.close();
	}

}

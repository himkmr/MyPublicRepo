import java.util.Scanner;


public class ProductApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	System.out.println(Product.getCount());
		String list_array[] = new String[100];
		Scanner sc = new Scanner(System.in);
		int index = 0;
		while(true)
		{
			System.out.println("What do you want to create?  b : book , s : software");
			String code = sc.nextLine();
			
			if(code.equalsIgnoreCase("b"))
			{
					Book bk1 = new Book();
					bk1.setCode("Book");
					System.out.println("Enter Description of Book");
					String desc = sc.nextLine();
					System.out.println("Enter Author of Book");
					bk1.setDescription(desc);
					String Author = sc.nextLine();
					bk1.setAuthor(Author);
					System.out.println("Enter Price of Book");
					double price = sc.nextDouble();
					bk1.setPrice(price);
					list_array[index] = bk1.toString("detail");
					index++;
					String trash = sc.nextLine();
			}		
			else
			{
					Software sf = new Software();
					sf.setCode("Software");
					System.out.println("Enter Description of Software");
					String desc = sc.nextLine();
					sf.setDescription(desc);
					System.out.println("Enter Version of Software");			
					String version = sc.nextLine();
					sf.setVersion(version);
					System.out.println("Enter Price of Software");
					double price = sc.nextDouble();
					sf.setPrice(price);
					list_array[index] = sf.toString("detail");
					index++;			
					String trash = sc.nextLine();
			}
			
			System.out.println("Continue to enter more: y/n ");
			String proceed = sc.nextLine();
			if(proceed.equalsIgnoreCase("y"))
				continue;
			else
				break;

		}
		
		int i=0;
		for(i=0; i<index;i++)
		{
			System.out.println(list_array[i]);
			System.out.println("");
			
		}
		
		sc.close();
	}

}

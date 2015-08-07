import java.util.HashMap;
import java.util.Scanner;


public class HashMap_App {
public static void main(String[] ar)
{
	HashMap<Integer, String> myMap = new HashMap<Integer, String>();

	Scanner sc = new Scanner(System.in);
	while(true)
	{
		System.out.println("Enter Integer: ");
		int key = sc.nextInt();
		System.out.println("Enter Associateed String: ");
		sc.nextLine();	//trash 
		String value = sc.nextLine();
		myMap.put(key, value);
		
		System.out.println("Enter more? (y/n)");
		String response = sc.nextLine();
		if(!response.equalsIgnoreCase("y"))
			break;
	
	}
	
	while(true)
	{
		System.out.println("Enter key to Print: ");
		int key = sc.nextInt();
		sc.nextLine();			//trash
		if(!myMap.containsKey(key))
		{
			System.out.println("Key not found, please enter value to add");
			String value = sc.nextLine();
			myMap.put(key, value);		
		}
  		System.out.println("key: "+ key + "       Value: " +myMap.get(key));
		System.out.println(" more? (y/n)");
		String response = sc.nextLine();
		if(!response.equalsIgnoreCase("y"))
			break;
	
	}
	
	sc.close();
	
	
}
}

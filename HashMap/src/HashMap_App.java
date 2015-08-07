import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;


public class HashMap_App {
public static void main(String[] ar)
{
	
	HashMap<Integer, String> myMap = new HashMap<Integer, String>();

	Scanner sc = new Scanner(System.in);

		System.out.println("enter file name: ");
		String file = sc.nextLine();
		String filename = (System.getProperty("user.dir") + File.separatorChar +file);

		FileReader fr = null;
		BufferedReader br = null;
		FileWriter writer=null;
		try {
			writer = new FileWriter(filename,true);
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		try {
			fr = new FileReader(filename);
			br = new BufferedReader(fr);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}

		
	String line = "";
	while(line!=null)
	{
		
		try {
			line = br.readLine();
			if(line==null)
				break;
			String arr[] = line.split("(\\s)+");
			int num = Integer.parseInt(arr[0]);
			myMap.put(num, arr[1]);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
		
			}
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
			try {
				writer.write(key+"   "+value+"\n");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
  		System.out.println("key: "+ key + "       Value: " +myMap.get(key));
		System.out.println(" more? (y/n)");
		String response = sc.nextLine();
		if(!response.equalsIgnoreCase("y"))
			break;
	
	}
	
	
	try {
		writer.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	sc.close();
	
	
}
}

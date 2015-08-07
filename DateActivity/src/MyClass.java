import java.util.Scanner;


public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter year");
			int year = sc.nextInt();			
			System.out.println("Enter month");
			int month = sc.nextInt();
			System.out.println("Enter day");
			int day = sc.nextInt();
			
			MyDateClass.getInfo(year,month,day);
			System.out.println("Continue?  (y/n)");
			sc.nextLine();
			String cont = sc.nextLine();
			if(cont.equalsIgnoreCase("y"))
				continue;
			else
				break;
		}
		sc.close();
	}

}

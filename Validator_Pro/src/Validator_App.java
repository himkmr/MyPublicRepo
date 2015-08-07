import java.util.Scanner;


public class Validator_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name, age, height, weight, decimal;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter Your Name: ");
			name = sc.nextLine();
			while(!Validator.validate_Name(name))
			{
				System.out.println("Invalid Name, Enter again: ");
				name = sc.nextLine();
			}
			
			System.out.println("Enter Your Age:  ");
			age = sc.nextLine();
			while(!Validator.validate_Age(age))
			{
				System.out.println("Invalid Age, Enter again: ");
				age = sc.nextLine();
			}
			
			
			
			System.out.println("Enter Your Weight: ");
			weight = sc.nextLine();
			while(!Validator.validate_Weight(weight))
			{
				System.out.println("Invalid Weight, Enter again: ");
				weight = sc.nextLine();
			}
			
			
			System.out.println("Enter Your Height: ");
			height = sc.nextLine();
			while(!Validator.validate_Height(height))
			{
				System.out.println("Invalid Height, Enter again: ");
				height = sc.nextLine();
			}
			
			
			System.out.println("Enter Your Favorite Decimal between 0 and 1: ");
			decimal = sc.nextLine();
			while(!Validator.validate_Decimal_Number(decimal))
			{
				System.out.println("Invalid Height, Enter again: ");
				decimal = sc.nextLine();
			}
			
			
			System.out.println("Name: " + name+"\n" + "Age: " +  age+"\n" + "Height: " + height+"\n" +"Weight:" +weight+"\n"+"Decimal " + decimal+"\n");
			
			System.out.println("Continue?   (y/n)");
			String cont = sc.nextLine();
			
			
			if(!cont.equalsIgnoreCase("y"))
				break;
							
		}
		sc.close();
	}

}

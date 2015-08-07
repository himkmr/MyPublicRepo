import java.util.Scanner;


public class Calculator {

	public static void main(String[] args) {
		Calculator c= new Calculator();
		Scanner sc = new  Scanner(System.in);
		while(true){
		System.out.println("Enter First number:  ");
		double a = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter operation: ");
		String op = sc.nextLine();
		System.out.println("Enter Second Number ");
		double b = sc.nextDouble();
		sc.nextLine();//trash
		double result= 0;
		if(op.equals("+"))
		{
			 result = c.add(a, b);
		}
		else if(op.equals("*"))
		{
			 result = c.multiply(a, b);
		}
		else if(op.equals("-"))
		{
			 result = c.subtract(a, b);
		}
		else if(op.equals("/"))
		{
			 result = c.divide(a, b);
		}

		System.out.println("Result: " +result);
		
		System.out.println("Continue? : (y/n)");
		if(!(sc.nextLine().equalsIgnoreCase("y")))
			break;
		
		}
	}
	

public double add(double a, double b)
{	
	return a+b;
}
public double multiply(double a, double b)
{
	return a*b;
}
public double subtract(double a, double b)
{
	return a-b;
}
public double divide(double a, double b)
{
	return a/b;
}

	
	
	
	
}

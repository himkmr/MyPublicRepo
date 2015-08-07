import java.util.Scanner;

class Division {
	public static void main(String[] args) {

		int a, b, result = 0;

		Scanner input = new Scanner(System.in);
		System.out.println("Input two integers");
		try {
			a = input.nextInt();
			b = input.nextInt();
			result = a / b;
			
		} catch (ArithmeticException e) {
			e.printStackTrace();			
		} 
		finally{
			System.out.println("Finally Always Executes!\n");
		}

		System.out.println("Result = " + result);
		input.close();
	}
}
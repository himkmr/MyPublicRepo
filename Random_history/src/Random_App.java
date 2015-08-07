import java.util.Scanner;


public class Random_App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[][] results= new String[10][10];
		int index = 0, i = 0; 
		while(true)
		{
			System.out.println("Enter a question: ");
			String que = sc.nextLine();
			String ans = Generator.getRandom();
			System.out.println(ans);
			results[index][0] = que;
			results[index][1] = ans;
		
			System.out.println("Do you wish to continue ?  (y/ n/ history) ");
			String cont;
			cont = sc.nextLine();
			if(cont.equalsIgnoreCase("y"))
			{
				index++;  continue;							//continue only when user enters y, next lines are not executed
			}
			else if(cont.equalsIgnoreCase("history"))			//print and exit
			{
				for(i = 0; i <= index; i++)
				{ 
				}
			}
			break;							
		}		
		sc.close();
	}

}

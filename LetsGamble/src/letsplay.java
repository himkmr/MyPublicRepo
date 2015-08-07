import java.util.Scanner;


public class letsplay {

	public static void main(String[] args) {
		int money = 100;
		
		Scanner sc = new Scanner(System.in);
		while(money > 0 && money < 500)
		{
			ShuffleCards sf = new ShuffleCards();
			System.out.println("How much do you wat to bet? available : " + money);
			int bet = sc.nextInt();
			if(bet > money)
			{
				System.out.println("Insufficient funds. Try again.");
				continue;
			}
			
			
			System.out.println("Which one is the ace ?");
			System.out.println(" ##   ##   ##");
			System.out.println("  1    2    3");
			int guess = sc.nextInt();
			sc.nextLine();// trash
			if(sf.array[guess-1] == 1)
			{
				int i =0;
				money = money + bet;
				System.out.println("You Won! , Balance = "+ money);
				for(i=0;i<3;i++){
					if(sf.array[i] == 1)
						System.out.print(" AA ");
					else
						System.out.print(" ## ");
				}				
				
				
				
				System.out.println("\nPlay more ?   (y/n)");
				String cont = sc.nextLine();
				if(cont.equalsIgnoreCase("y"))
					continue;
				else
					{
						System.out.println("You are leaving with $"+money);
						break;
					}
			}
			else
			{
				int i = 0;
				money = money - bet;
				System.out.println("You Lost! , Balance = "+ money);
				for(i=0;i<3;i++){
					if(sf.array[i] == 1)
						System.out.print(" AA ");
					else
						System.out.print(" ## ");
				}
							
				System.out.println("\nPlay more ?   (y/n)");
				String cont = sc.nextLine();
				if(cont.equalsIgnoreCase("y"))
					continue;
				else
				{
					System.out.println("You are leaving with $"+money);
					break;
				}
			}
			
		}
		
		System.out.println("-------------------GAME OVER !You are leaving with $" + money +" -------------------------");
		
		sc.close();
		
	}

}

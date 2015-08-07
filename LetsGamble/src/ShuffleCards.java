import java.util.Random;


public class ShuffleCards {
int []array;

public ShuffleCards()		//creates a new Integer array, generate random, set array[random_number] = 1
{
	array = new int[3];
	Random r = new Random();
	int num = r.nextInt(3);
//	System.out.println("random is " + (num+1));
	array[num] = 1;
}
	
	
}

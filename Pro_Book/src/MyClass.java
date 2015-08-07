import java.util.Scanner;

/* Only three majors supported   math, bio, physics
 * States supported NY, NJ, MD
 */



public class MyClass {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String[][] data =  new String[100][5];
	Scanner sc = new Scanner(System.in);
	String[] States=new String[10];
	String[] Major=new String[10];
	int males = 0;
	int females = 0;
	double total_male_gpa = 0;
	double total_female_gpa =0;
	int math_count = 0;
	int physics_count = 0;
	int bio_count = 0;
	int NY_count = 0;
	int NJ_count = 0;
	int MD_count = 0;
	double bio_gpa =0.0;
	double math_gpa=0;
	double physics_gpa =0;
	double NY_gpa =0.0;
	double NJ_gpa=0;
	double MD_gpa =0;
	
	int index = 0;
	while(true)
	{
		
		System.out.println("Enter your Name :");
		data[index][0] = sc.next();
		if(data[index][0].equals("quit"))
			break;	
		
		
		
		System.out.println("Enter your Gender M/F :");
		data[index][1] = sc.next();
		if(( data[index][1].equals("m")) || (data[index][0].equals("M")))			//if male, increase the male count, and add to male GPA
		{	
			males++;
			System.out.println("Enter your Grade :");
			data[index][2] = sc.next();
			total_male_gpa += Double.parseDouble(data[index][2]); 	//convert string to Double
		}
		else		//females gpa and count
		{
			females++;
			System.out.println("Enter your Grade :");
			data[index][2] = sc.next();
			total_female_gpa += Double.parseDouble(data[index][2]); 
			
		}
		
		//Major count and GPA
		System.out.println("Enter your Major :");
		data[index][3] = sc.next();		
		if(data[index][3].equals("bio"))
		{
			bio_count++;
			bio_gpa += Double.parseDouble(data[index][2]);		
		}
		else if(data[index][3].equals("math"))
		{
			math_count++;
			math_gpa += Double.parseDouble(data[index][2]);
		}
		else if(data[index][3].equals("physics"))
		{
			physics_count++;
			physics_gpa += Double.parseDouble(data[index][2]);
			
		}
		
		//State Count and GPA
		System.out.println("Enter your State of Origin :");
		data[index][4] = sc.next();
		if(data[index][4].equals("NY"))
		{
			NY_count++;
			NY_gpa += Double.parseDouble(data[index][2]);						
		}
		else if(data[index][3].equals("NJ"))
		{
			NJ_count++;
			NJ_gpa += Double.parseDouble(data[index][2]);			
		}
		else if(data[index][3].equals("MD"))
		{
			MD_count++;
			MD_gpa += Double.parseDouble(data[index][2]);			
		}
				index++;
					
	}
		
	{						//Overall Averages
		double avg = (total_male_gpa+total_female_gpa)/(males+females);
		System.out.println("Overall Average = "+avg);
		
		if(males!=0){
			double mavg = (total_male_gpa)/(males);		
			System.out.println("Male Average = "+(mavg));
		}
		else
			System.out.println("Male Average = 0");
	
		
		if(females!=0){
			double favg = (total_female_gpa)/(females);	
			System.out.println("Female Average = "+favg);
		
		}
		else
			System.out.println("Female Average = 0");
	
	//Major Average	
		if(math_count!=0)
		{
			double mathavg = math_gpa/math_count;
			System.out.println("Math Average = "+mathavg);
		}
		else
			System.out.println("Math Average = 0");
		
		if(bio_count!=0)
		{
			double bioavg = bio_gpa/bio_count;
			System.out.println("Bio Average = "+bioavg);
		}
		else
			System.out.println("Bio Average = 0");
		if(physics_count!=0)
		{
			double pavg = physics_gpa/physics_count;
			System.out.println("Physics Average = "+pavg);
		}
		else
			System.out.println("Physics Average = 0");
	
	
	//State Average
	
		if(NY_count!=0)
		{
			double nyavg = NY_gpa/NY_count;
			System.out.println("New York Average = "+nyavg);
		}
		else
			System.out.println("New York Average = 0");
		
		if(NJ_count!=0)
		{
			double njavg = NJ_gpa/NJ_count;
			System.out.println("New Jersey Average = "+njavg);
		}
		else
			System.out.println("New Jersey Average = 0");
		if(MD_count!=0)
		{
			double mdavg = NY_gpa/NY_count;
			System.out.println("Maryland Average = "+mdavg);
		}
		else
			System.out.println("Maryland Average = 0");
		
	
	}
	

	}
	
	
	

}

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Validator {

	public static boolean validate_Name(String str)
	{
		String regex = "[a-zA-Z]+";
		Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(str);
	    return matcher.matches();	    	
	}
	
	public static boolean validate_Age(String str)
	{
		String regex = "[0-9]+";
		Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(str);
	   if( matcher.matches())
	   {
		   int age = Integer.parseInt(str);
		   if(age >0 && age <101)
			   return true;
		   else
			   return false;
		   
	   }
	   else 
		   return false;
		
	}
	
	public static  boolean validate_Height(String str)
	{
		String regex = "([0-9]+(\\.[0-9]+)?)+";
		Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(str);
	   if( matcher.matches())
	   {
		   double height= Double.parseDouble(str);
		   if(height > 35 && height < 93)
			   return true;
		   else
			   return false;
		   
	   }
	   else
		   return false;			
	}
	
	public static boolean validate_Weight(String str)
	{
		String regex = "([0-9]+(\\.[0-9]+)?)+";
		Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(str);
	   if( matcher.matches())
	   {
		   double weight = Double.parseDouble(str);
		   if(weight >80 && weight < 400)
			   return true;
		   else
			   return false;
		   
	   }
	   else 
		   return false;				
	}
	
	public static boolean validate_Decimal_Number(String str)
	{
		String regex = "([0-9]+(\\.[0-9]+)?)+";
		Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(str);
	   if( matcher.matches())
	   {
		   double num = Double.parseDouble(str);
		   if(num >0 && num <1)
			   return true;
		   else
			   return false;
		   
	   }
	   else
		   return false;	
	}
	
}

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Validator {
public static boolean validate_Code(String code)
{
	if(code==null )
		return false;
	else if(code.equalsIgnoreCase("java") || code.equalsIgnoreCase("jsp"))
		return true;
	else
		return false;

}
public static boolean validate_Price(String price)
{
	if(price==null )
		return false;
	Pattern p = Pattern.compile("((-|\\+)?[0-9]+(\\.[0-9]+)?)+"); 
	Matcher m = p.matcher(price);
	
	if(m.matches())
		return true;
	else
		return false;

}
public static boolean validate_Quantity(String quantity)
{
	if(quantity==null ||quantity.equals("") )
		return false;
	Pattern p = Pattern.compile("[0-9]*"); 
	Matcher m = p.matcher(quantity);

	
	if(m.matches())
		return true;
	else
		return false;


}
}

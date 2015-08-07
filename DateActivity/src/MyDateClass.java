import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class MyDateClass {

	public static void getInfo(int year, int month, int dayOfMonth)
	{
		String seed = "" +year+month+dayOfMonth;
		Date now = new Date();
		DateFormat df = new SimpleDateFormat("y"); 
		df.format(now);
		GregorianCalendar gc = new GregorianCalendar( year, month-1, dayOfMonth);
		GregorianCalendar gcnow = new GregorianCalendar();

		if(gc.get(Calendar.DAY_OF_WEEK) == GregorianCalendar.SUNDAY )
			System.out.println("It was SUNDAY");
		else if(gc.get(Calendar.DAY_OF_WEEK) == GregorianCalendar.SATURDAY )
			System.out.println("It was SATURDAY");
		else if(gc.get(Calendar.DAY_OF_WEEK)== GregorianCalendar.MONDAY )
			System.out.println("It was MONDAY");
		else if(gc.get(Calendar.DAY_OF_WEEK)== GregorianCalendar.TUESDAY )
			System.out.println("It was TUESDAY");
		else if(gc.get(Calendar.DAY_OF_WEEK) == GregorianCalendar.WEDNESDAY )
			System.out.println("It was SUNDAY");
		else if(gc.get(Calendar.DAY_OF_WEEK) == GregorianCalendar.THURSDAY )
			System.out.println("It was SUNDAY");
		else if(gc.get(Calendar.DAY_OF_WEEK) == GregorianCalendar.FRIDAY )
			System.out.println("It was SUNDAY");
		

		
		Date startdate = gc.getTime();
		Date enddate = gcnow.getTime();
		long startTime = startdate.getTime();
		long endTime = enddate.getTime();
		
		long days = (endTime - startTime)/ (1000 * 60 * 60 * 24);
		System.out.println("It was "+ days + "   ago");
		
		System.out.println(Weather.getWeather(seed));
			  }
	}
	

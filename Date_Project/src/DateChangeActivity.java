import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
public class DateChangeActivity {

	public static void main(String[] args) {
		Date now = new Date();
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		DateFormat dateFormat2 = new SimpleDateFormat("HH:mm");
		System.out.println(dateFormat.format(now));
		System.out.println(dateFormat2.format(now));
		
	}

}
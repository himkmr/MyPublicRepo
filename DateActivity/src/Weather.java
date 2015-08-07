import java.util.Random;


public class Weather {

	public static String getWeather(String seed1)
	{
		String weather_array[] = {"It was hot that day", "It was rainy that day", "It was cloudy that day", "It was snowy that day", "It was a beautiful Weather"};
		int seed2 = Integer.parseInt(seed1);
		String weather = "";
		
		Random rnd = new Random(seed2);
		int num = rnd.nextInt(5);
		
		weather = weather_array[num];
		return weather;
	}
}

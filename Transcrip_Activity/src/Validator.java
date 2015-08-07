import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

	public static boolean validate_Course(String str) {
		if (str == null)
			return false;
		String regex = "[a-zA-Z]+\\s[0-9]+";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		if (matcher.matches())
			return true;
		else
			return false;

	}

	public static boolean validate_Grade(String str) {
		if (str == null)
			return false;
		String regex = "[a-zA-Z]";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		if (matcher.matches())
			return true;
		else
			return false;
	}

	public static boolean validate_Credits(String str) {
		if (str == null)
			return false;
		String regex = "([0-9]+(\\.[0-9]+)?)+";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		if (matcher.matches())
			return true;
		else
			return false;

	}
}

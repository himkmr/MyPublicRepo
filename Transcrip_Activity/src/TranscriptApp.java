import java.util.Scanner;

public class TranscriptApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Transcript tr = new Transcript();
		while (true) {
			System.out.println("Enter Course: ");
			String course = sc.nextLine();

			while (!Validator.validate_Course(course)) {
				System.out.println("Invalid Course, Enter Again: ");
				course = sc.nextLine();
			}

			System.out.println("Enter Credits: ");
			String credits = sc.nextLine();
			while (!Validator.validate_Credits(credits)) {
				System.out.println("Invalid Credits, Enter Again: ");
				credits = sc.nextLine();
			}

			System.out.println("Enter Grade: ");
			String grade = sc.nextLine();
			while (!Validator.validate_Grade(grade)) {
				System.out.println("Invalid grade, Enter Again: ");
				grade = sc.nextLine();
			}

			double credits_db = Double.parseDouble(credits);
			char grade_char = grade.charAt(0); // string to char

			tr.setCourseEnrollments(course, credits_db, grade_char);

			System.out.println("Enter another course (y/n)");
			String cont = sc.nextLine();
			if (!cont.equalsIgnoreCase("y"))
				break;

		}
		tr.printRecords();
		System.out.format("\n%50s ",
				"OverAll GPA: " + tr.getFormatedGPA(tr.getOverAllGpa()));
		sc.close();
	}

}

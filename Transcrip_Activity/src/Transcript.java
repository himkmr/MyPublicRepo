import java.util.ArrayList;

public class Transcript {
	ArrayList<CourseEnrollment> al;

	public Transcript() {
		al = new ArrayList<CourseEnrollment>();
	}

	public void setCourseEnrollments(String code, double credits, char grade) {
		CourseEnrollment course = new CourseEnrollment();
		course.setCourse_code(code);
		course.setCredits(credits);
		course.setGrade(grade);

		if (grade == ('A') || grade == ('a'))
			course.setQuality_points(4.0);
		else if (grade == ('B') || grade == ('b'))
			course.setQuality_points(3.5);
		else if (grade == ('C') || grade == ('c'))
			course.setQuality_points(3.0);
		else if (grade == ('D') || grade == ('d'))
			course.setQuality_points(2.5);
		else
			course.setQuality_points(2.5);

		al.add(course);
	}

	public ArrayList<CourseEnrollment> getCourses() {
		return al;
	}

	public void printRecords() {
		String format_string = "%10s%10s%10c%20s\n";
		System.out.format("%10s%10s%10s%20s\n", "Course", "Credits", "Grade",
				"Quality Points");
		System.out.format("%10s%10s%10s%20s\n", "------", "-------", "-----",
				"--------------");
		for (CourseEnrollment elem : al) {

			System.out.format(format_string, elem.getCourse_code(),
					elem.getFormatedDouble(elem.getCredits()), elem.getGrade(),
					elem.getFormatedDouble(elem.getQuality_points()));
		}

	}

	public double getOverAllGpa() {
		double gpa = 0;
		for (CourseEnrollment elem : al) {
			gpa += elem.getQuality_points();

		}
		return gpa / al.size();
	}

	public String getFormatedGPA(double gpa) {
		// NumberFormat number = NumberFormat.getNumberInstance();
		// String gpaString = number.format(gpa);
		return String.format("%.2f", gpa);
	}

}

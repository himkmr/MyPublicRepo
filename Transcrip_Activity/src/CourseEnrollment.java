//made change here

public class CourseEnrollment {
	private String course_code;
	private double credits;
	private double quality_points;
	private char grade;

	// getters and setters
	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public String getCourse_code() {
		return course_code;
	}

	public void setCourse_code(String course_code) {
		this.course_code = course_code;
	}

	public double getCredits() {
		return credits;
	}

	public void setCredits(double credits) {
		this.credits = credits;
	}

	public double getQuality_points() {
		return quality_points;
	}

	public void setQuality_points(double quality_points) {
		this.quality_points = quality_points;
	}

	public String getFormatedDouble(double db) {
		// NumberFormat number = NumberFormat.getNumberInstance();
		// String dbString = number.format(db);
		return String.format("%.1f", db);
	}
}

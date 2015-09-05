public class A_GradeBook {
	private String courseName;

	public void setCourseName(String cname) {
		courseName = cname;
	}

	public String getCourseName() {
		return courseName;
	}

	// default constructor
	public A_GradeBook() {

	}

	public A_GradeBook(String cname) {
		courseName = cname;
	}

	public void displayMessage() {
		if(courseName != null)
			System.out.printf("%s course is added.\n", courseName);
		else
			System.out.println("Name the course.");
	}
}
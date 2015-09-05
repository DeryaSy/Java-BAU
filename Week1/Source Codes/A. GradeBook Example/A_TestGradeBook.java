public class A_TestGradeBook {
	public static void main(String[] args) {
		
		A_GradeBook gb = new A_GradeBook();
		gb.displayMessage();		
		gb.setCourseName("Java");
		gb.displayMessage();
		
				
		A_GradeBook gb2 = new A_GradeBook("Mathematics");
		gb2.displayMessage();
		
		//System.out.println("The initial value for gb2 was " + gb2.getCourseName() + ".");
		System.out.printf("The initial value for gb2 was %s.\n", gb2.getCourseName());
		//gb2.CourseName = "Chemistry";
		gb2.setCourseName("Chemistry");
		gb2.displayMessage();
		
	}
}
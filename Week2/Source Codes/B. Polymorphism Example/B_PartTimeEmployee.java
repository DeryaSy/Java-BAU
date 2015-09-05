public class B_PartTimeEmployee extends B_Employee {
	private int workingHours;

	public int getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}

	private double hourlySalary;

	public double getHourlySalary() {
		return hourlySalary;
	}

	public void setHourlySalary(double hourlySalary) {
		this.hourlySalary = hourlySalary;
	}

	public B_PartTimeEmployee(String name, String surname, double hourlySalary,
			int workingHours) {
		super(name, surname);
		this.workingHours = workingHours;
		this.hourlySalary = hourlySalary;
	}

	public double calculateTotalIncome() {
		return hourlySalary * workingHours;
	}
}

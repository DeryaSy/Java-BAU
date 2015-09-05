public class B_SalariedEmployee extends B_Employee {
	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public B_SalariedEmployee(String name, String surname, double salary) {
		super(name, surname);
		this.salary = salary;
	}

	public double calculateTotalIncome() {
		return salary;
	}
}

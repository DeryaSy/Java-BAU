public class A_CommissionedEmployee extends A_Employee {
	private double commission;
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
	public A_CommissionedEmployee(String name, String surname, double salary, double commission) {
		super(name, surname, salary);
		this.commission = commission;
	}
}

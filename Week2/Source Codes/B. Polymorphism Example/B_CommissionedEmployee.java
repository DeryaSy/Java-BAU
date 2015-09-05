public class B_CommissionedEmployee extends B_SalariedEmployee {
	private double commission;

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	public B_CommissionedEmployee(String name, String surname, double salary,
			double commission) {
		super(name, surname, salary);
		this.commission = commission;
	}

	public double calculateTotalIncome() {
		return super.calculateTotalIncome() + commission;
	}
}

public class B_TestEmployee {

	public static void main(String[] args) {
		B_PartTimeEmployee e1 = new B_PartTimeEmployee("efsun", "karaca", 50, 35);
		B_SalariedEmployee e2 = new B_SalariedEmployee("barýþ", "yüce", 1500);
		B_CommissionedEmployee e3 = new B_CommissionedEmployee("duygu", "çakýr", 1500, 100);

		B_Employee[] emp = new B_Employee[3];
		emp[0] = e1;
		emp[1] = e2;
		emp[2] = e3;

		for (B_Employee e : emp) {
			System.out.println(e);
			//System.out.println(e.toString());
			if(e instanceof B_CommissionedEmployee)
			{
				((B_CommissionedEmployee) e).setCommission(1.10 * ((B_CommissionedEmployee)e).getCommission());
			}
		}
		
		for (B_Employee e : emp) {
			System.out.println(e);
		}
		
		/*Employee[] emp = new Employee[3];
		emp[0] = new PartTimeEmployee("efsun", "karaca", 50, 35);
		emp[1] = new SalariedEmployee("barýþ", "yüce", 1500);
		emp[2] = new CommissionedEmployee("özge", "yücel", 1500, 100);*/
	}
}
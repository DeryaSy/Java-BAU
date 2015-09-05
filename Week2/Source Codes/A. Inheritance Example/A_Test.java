public class A_Test {
	public static void main(String[] args) {
		A_Employee e1 = new A_Employee("efsun", "karaca", 500);

		A_CommissionedEmployee e2 = new A_CommissionedEmployee("özge", "yücel", 450,
				100);
		
		System.out.println(e1.toString());
		System.out.println(e2.toString());
	}
}

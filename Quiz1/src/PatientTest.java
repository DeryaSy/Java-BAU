import java.util.Scanner;


public class PatientTest {

	
	public static void main(String[] args) {
	
		Patient p = new Patient();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Name ");
		p.setPatientName(sc.nextLine());
		System.out.println("Surname");
		p.setPatientSurname(sc.nextLine());
		System.out.println("NumberOfDrugs");
		p.setNumberOfDrus(sc.nextInt());
		
		p.displayPatientInfo();

	}

}

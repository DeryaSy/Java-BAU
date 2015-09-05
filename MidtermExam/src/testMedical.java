
public class testMedical {
	
	//derya sismanyazici

	
	public static void main(String[] args) {
		
		Doctor d1 = new Doctor();
		Nurse n1 = new Nurse();
		
	examineProcess(d1);
	examineProcess(n1);
		
	
	}
		

	
	
	public static void examineProcess(MedicalCareProvider m) {
		
		if(m instanceof Doctor) {
			((Doctor) m).examinePatient();
		}
		
		else if (m instanceof Nurse) {
			((Nurse) m).monitorPatient();
		}
			
		}
	


}

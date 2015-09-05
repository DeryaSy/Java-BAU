
public class Nurse extends Person implements MedicalCareProvider {

	
	private String expertise;

	@Override
	public void setExpertise(String expertise) {
		this.expertise = expertise;
		
	}

	@Override
	public String getExpertise() {
		
		return expertise;
	}
	
	public void monitorPatient() {
		
		
		System.out.println("Nurse monitors patient");
		
	}
	
}

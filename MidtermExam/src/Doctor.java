
public class Doctor extends Person implements MedicalCareProvider{
	
	private String expertise;

	@Override
	public void setExpertise(String expertise) {
	
		this.expertise = expertise;
		
	}

	@Override
	public String getExpertise() {
	
		return expertise;
	}
	
	
	public void examinePatient() {
		System.out.println("Doctor examines patient");
		
	}
	

}

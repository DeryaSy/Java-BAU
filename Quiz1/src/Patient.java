
public class Patient {

	private String patientName;
	private String patientSurname;
	private int numberOfDrugs;
	
	public Patient(){
		patientName = "";
		patientSurname = "";
		numberOfDrugs = 0;
	}
	
	public Patient(String name,String surname,int drug){
		
		patientName = name;
		patientSurname = surname;
		numberOfDrugs = drug;
	}
	
	public String getPatientName(){
		
		return patientName;
	}
	
	public void setPatientName(String name){
		
		patientName = name;
	}
	
public String getPatientSurname(){
		
		return patientSurname;
	}

public void setPatientSurname(String surname){
	
	patientSurname = surname;
}
public int getNumberOfDrugs(){
	
	return numberOfDrugs;
}

public void setNumberOfDrus(int drug){
	
	numberOfDrugs = drug;
}
public int  calculateDrugCost(){
	
	return numberOfDrugs*5;
}
public void displayPatientInfo(){
	
System.out.println("Name : " + getPatientName() );
System.out.println("Surname : " + getPatientSurname());
System.out.println("NumberOfDrugs  : " + getNumberOfDrugs()); 
System.out.println("DrugCost : " +calculateDrugCost());
}
}

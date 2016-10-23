
public class Patient extends Person{
	private String idNo;
	
	Patient(String patientName, String idNum){
		super.setName(patientName);
		idNo = idNum;
	}
	
	public void writeOutput(){
		System.out.println("Name: " + super.getName());
		System.out.println("Social Security #: " + idNo);
		System.out.println("");
	}
}

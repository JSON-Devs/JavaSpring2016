
public class Doctor extends Person{
	private String specialty;
	private double visitFee;
	
	Doctor(String doctorName, String docSpec, double vFee){
		super.setName(doctorName);
		specialty = docSpec;
		visitFee = vFee;
	}
	
	public double getVisitFee(){
		return visitFee;
	}
	
	public void writeOutput(){
		System.out.println("Name: " + super.getName());
		System.out.println("Office Fee: $" + visitFee);
		System.out.println("Specialty: " + specialty);
		System.out.println("");
	}
}

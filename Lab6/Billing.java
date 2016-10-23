
public class Billing {
	private String patientName, doctorName;
	private double billingAmt;
	Billing(Doctor doc, Patient pat){
		patientName = pat.getName();
		doctorName = doc.getName();
		billingAmt = doc.getVisitFee();
	}
	
	public void writeOutput(){
		System.out.println("Doctor: " + doctorName);
		System.out.println("Patient: " + patientName);
		System.out.println("Billing Amount: $" + billingAmt);
		System.out.println("===========================");
		System.out.println("");
	}
	
	public boolean billEquals(Billing otherBill){
		if(this.doctorName.equalsIgnoreCase(otherBill.doctorName) && this.patientName.equalsIgnoreCase(otherBill.patientName) && this.billingAmt == otherBill.billingAmt){
			return true;
		}
		else{
			return false;
		}
	}
}

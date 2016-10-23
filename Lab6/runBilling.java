
public class runBilling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient pat1 = new Patient("Calvin", "123-45-6789");
		Patient pat2 = new Patient("Hobbes","987-65-4321");
		Doctor doc1 = new Doctor("Spock","Pediatrician", 200.0);
		Doctor doc2 = new Doctor("Dolittle","Witch", 175.0);
		Billing bill1 = new Billing(doc1, pat1);
		Billing bill2 = new Billing(doc1, pat2);
		Billing bill3 = new Billing(doc2, pat1);
		
		System.out.println("Two docs:");
		System.out.println("");
		doc1.writeOutput();
		doc2.writeOutput();
		
		System.out.println("Two patients:");
		System.out.println("");
		pat1.writeOutput();
		pat2.writeOutput();
		
		System.out.println("Three billing records:");
		System.out.println("");
		bill1.writeOutput();
		bill2.writeOutput();
		bill3.writeOutput();
		
		System.out.println("First billing record equal to the second = " + bill1.billEquals(bill2));
	}

}


public class runPay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PayCalculator regPay = new RegularPay(7.5);
		PayCalculator hazPay = new HazardPay(7.5);
		System.out.println("40 hrs reg pay 7.5 is " + regPay.getPay(40));
		System.out.println("40 hrs reg pay 7.5 is " + hazPay.getPay(40));
		System.out.println("");
		regPay.changeRate(17.0);
		hazPay.changeRate(17.0);
		System.out.println("40 hrs reg pay 17 is " + regPay.getPay(40));
		System.out.println("40 hrs reg pay 17 is " + hazPay.getPay(40));
		
		
	}

}

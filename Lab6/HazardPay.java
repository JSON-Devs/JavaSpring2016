
public class HazardPay extends PayCalculator{
	public HazardPay(double myPay){
		payRate = myPay;
	}
	public double getPay(double hours){
		pay = (super.getPay(hours) * 1.5);
		return pay;
		
	}
}

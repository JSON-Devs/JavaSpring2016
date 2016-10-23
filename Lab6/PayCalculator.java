
public abstract class PayCalculator {
	public double payRate, pay;
	
	public double getPay(double hours){
		pay = (hours * payRate);
		return pay;
	}
	public void changeRate(double newRate){
		payRate = newRate;
	}
}

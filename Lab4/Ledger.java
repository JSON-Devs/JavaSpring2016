
public class Ledger {
	
	static int maxSales;
	private double[] sale;
	int salesMade, targetSales;
	double totalSaleValue, averageSale;
	
	public Ledger(int max){
		maxSales = max;
		totalSaleValue = 0;
		averageSale = 0;
		targetSales = 0;
		salesMade = 0;
		sale = new double[maxSales];
	}
	public void addSale(double saleValue){
		sale[salesMade] = saleValue;
		salesMade++;
		totalSaleValue = totalSaleValue + saleValue;
	}
	public int getNumberOfSales(){
		return salesMade;
	}
	public double getTotalSales(){
		return totalSaleValue;
	}
	public double getAverageSale(){
		averageSale = (totalSaleValue / salesMade);
		return averageSale;
	}
	public int getCountAboveTarget(double target){
		targetSales = 0;
		for(int i=0; i<salesMade; i++){
			if(sale[i] > target){
				targetSales++;
			}
		}
		return targetSales;
	}
}

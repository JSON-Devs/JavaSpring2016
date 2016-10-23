
public class runLedger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalSalesMade, targetSales;
		double totalSales, averageSales;
		
		System.out.println("Testing Ledger:");
		
		System.out.println("Adding Sales 3.52, 2.43, 9.00, 3.5, 5.0");
		Ledger myTest = new Ledger(10);
		myTest.addSale(3.52);
		myTest.addSale(2.43);
		myTest.addSale(9.00);
		myTest.addSale(3.5);
		myTest.addSale(5.0);
		totalSalesMade = myTest.getNumberOfSales();
		System.out.println("Total number of sales are: " + totalSalesMade);
		totalSales = myTest.getTotalSales();
		System.out.println("Total amount of sales are: " + totalSales);
		averageSales = myTest.getAverageSale();
		System.out.println("The average sales amount is: " + averageSales);
		targetSales = myTest.getCountAboveTarget(3.5);
		System.out.println("Total number of sales greater than 3.5 are: " + targetSales);
		targetSales = myTest.getCountAboveTarget(3.0);
		System.out.println("Total number of sales greater than 3.0 are: " + targetSales);
	}

}

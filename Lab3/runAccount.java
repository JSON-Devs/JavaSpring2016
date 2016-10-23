
public class runAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account1 = new Account(1122, 20500);
		account1.setAnnualInterestRate(4.5);
		account1.getMonthlyInterestRate();
		account1.getMonthlyInterest();
		System.out.println("");
		System.out.println("Withdraw Test");
		account1.withdraw(100);
		
		System.out.println("");
		System.out.println("Deposit Test");
		account1.deposit(100);
	}

}

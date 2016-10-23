
import java.util.Date;

public class Account {

	private int id;
	private double balance, annualInterestRate, monthlyInterestRate, monthlyInterest;
	private Date dateCreated;
	
	public Account(){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		Date date = new Date();
		dateCreated = date;
	}
	
	public Account(int idIn, double balanceIn){
		id = idIn;
		balance = balanceIn;
		Date date = new Date();
		dateCreated = date;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public double getMonthlyInterestRate(){
		monthlyInterestRate = ((annualInterestRate/12)/100);
		return monthlyInterestRate;
		
	}
	public void getMonthlyInterest(){
		monthlyInterest = (balance*monthlyInterestRate);
		System.out.println("Balance is " + balance);
		System.out.println("Monthly interest is " + monthlyInterest);
		System.out.println("This account was created at " + dateCreated);
	}
	public void withdraw(double withAmmt){
		balance = (balance - withAmmt);
		System.out.println("New Balance: " + balance);
	}
	public void deposit(double depAmmt){
		balance = (balance + depAmmt);
		System.out.println("New Balance: " + balance);
	}
}

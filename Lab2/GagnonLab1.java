import java.util.*;
public class GagnonLab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		//Declare variables
		double myAge, myHeight, myWeight, BMG, numberOfBars;
		int myActivity;
		String mySex, junk;
		boolean sexTest;
		
		//Initial description
		System.out.println("This program will calculate the number of 230 calorie candy bars to eat to maintain your weight.");
		System.out.println("What is your Age in years?");
		myAge = keyboard.nextDouble();
		System.out.println("What is your height in inches?");
		myHeight = keyboard.nextDouble();
		System.out.println("What is your weight in pounds?");
		myWeight = keyboard.nextDouble();
		junk = keyboard.nextLine();
		do{
			System.out.println("What is your sex? Please enter 'M' for male or 'F' for female");
			mySex = keyboard.nextLine();	
			if((mySex.toUpperCase().equals("M")) || (mySex.toUpperCase().equals("F"))){
				sexTest = true;
			}
			else
			{
				sexTest = false;
			}
		}while(!sexTest);
		System.out.println("Are you:");
		System.out.println("1. Sedentary");
		System.out.println("2. Somewhat active (exercise occasionally)");
		System.out.println("3. Active (exercise 3-4 days per week)");
		System.out.println("4. Highly active (exercise every day)");
		System.out.println("Enter 1,2,3, or 4.");
		myActivity = keyboard.nextInt();
		keyboard.close();
		//Calculations
		if(mySex.toUpperCase().equals("F")){
			BMG = 655 + (4.3*myWeight) + (4.7*myHeight) - (4.7*myAge);
		}
		else{
			BMG = 66 + (6.3*myWeight) + (12.9*myHeight) - (6.8*myAge);
		}
		
		switch(myActivity){
			case 1:
				BMG = BMG * 1.2;
				break;
			case 2:
				BMG = BMG * 1.3;
				break;
			case 3:
				BMG = BMG * 1.4;
				break;
			case 4: 
				BMG = BMG * 1.5;
				break;
		}
		numberOfBars = (BMG/230);
		System.out.printf("A " + (mySex.toUpperCase().equals("F") ? "female" : "male") + " with those measurements should eat %.2f candy bars per day to maintain the same weight.", numberOfBars);
	}

}

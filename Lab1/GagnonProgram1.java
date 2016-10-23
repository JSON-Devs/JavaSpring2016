import java.util.*;

public class GagnonProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		//Declare Variables
		double x1;
		double x2;
		double y1;
		double y2;
		double totalDistance;
		double xValues;
		double yValues;
		//Output line asking for x1 and x2
		System.out.print("Enter x1 and y1: ");
		//Get the x1 value
		x1 = keyboard.nextDouble();
		//Get the y1 value
		y1 = keyboard.nextDouble();
		//Output line asking for x2 and y2
		System.out.print("Enter x2 and y2: ");
		//Get the x2 value
		x2 = keyboard.nextDouble();
		//Get the y2 value
		y2 = keyboard.nextDouble();
		
		//Subtract the two values
		xValues = x2 - x1;
		yValues = y2 - y1;
		
		//Square the values
		xValues = Math.pow(xValues, 2);
		yValues = Math.pow(yValues, 2);
		
		//Take the square root of the values added together
		totalDistance = Math.pow((xValues + yValues), 0.5);
		//Print out the distance
		System.out.print("The distance of the two points is " + totalDistance);
		
		keyboard.close();
	}

}

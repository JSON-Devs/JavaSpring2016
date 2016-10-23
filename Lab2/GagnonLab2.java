import java.util.*;
public class GagnonLab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int largestNum = 0, largestNumCount = 0, num;
		
		System.out.print("Enter an integer (0 ends the input): ");
		do{
			num = keyboard.nextInt();
			if (num > largestNum){
				largestNum = num;
				largestNumCount = 1;
			}
			else if(num == largestNum){
				largestNumCount++;
			}
		}while(num != 0);
		keyboard.close();
		System.out.println("The largest number is " + largestNum);
		System.out.println("The number " + largestNum + " appears " + largestNumCount + " times");

	}

}

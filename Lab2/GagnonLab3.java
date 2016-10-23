import java.util.*;
public class GagnonLab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int nume, deno, answer, remainder;
		
		do{
			System.out.print("Enter a numerator: ");
			nume = keyboard.nextInt();
			if(nume == 0){
				break;
			}
			System.out.print("Enter a denominator: ");
			deno = keyboard.nextInt();
			
			answer = (nume / deno);
			
			if(answer < 1){
				System.out.println(nume + " / " + deno + " is a proper fraction");
			}
			else if(answer >= 1){
				remainder = (nume % deno);
				if(remainder == 0){
					System.out.println(nume + " / " + deno + " is an improper fraction and it can be reduced to " + answer);
				}
				else{
					System.out.println(nume + " / " + deno + " is an improper fraction and it's mixed fraction is " + answer + " + " + remainder + " / " + deno);
				}
			}
		}while(nume != 0);
		keyboard.close();
		System.out.println("program exited");
	}

}

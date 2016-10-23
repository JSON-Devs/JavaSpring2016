import java.util.*;
public class LikedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> stadiumName = new LinkedList<String>();
		LinkedList<Double> gameRevenue = new LinkedList<Double>();
		String stadium = "";
		double revenue = 0;
		double totalRev = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the data now.");
		System.out.println("On each line enter a stadium name and the game revenue");
		System.out.println("Enter done when you are finished");
		stadium = keyboard.next();
		revenue = keyboard.nextDouble();
		while(!stadium.equals("done")){
			stadiumName.add(stadium);
			gameRevenue.add(revenue);
			stadium = keyboard.next();
			if(!stadium.equals("done")){
				revenue = keyboard.nextDouble();
			}
		}
		System.out.println("Enter the name of the stadium you want total revenue for:");
		stadium = keyboard.next();
		
		for(int i=0; i < (stadiumName.size() - 1); i++){
			if(stadiumName.get(i).equals(stadium)){
				totalRev = totalRev + gameRevenue.get(i);
			}
		}
		System.out.println("Total revenue is " + totalRev);
		keyboard.close();
	}

}

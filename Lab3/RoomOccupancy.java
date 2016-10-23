
public class RoomOccupancy {
	int numberInRoom;
	static int totalNumber;
	
	public RoomOccupancy(){
		numberInRoom = 0;
	}
	
	public void addOneToRoom(){
		numberInRoom++;
		totalNumber++;
	}
	
	public void removeOneFromRoom(){
		if(numberInRoom == 0){
			System.out.println("Error you can not have negative people");
		}
		else{
			numberInRoom--;
			totalNumber--;
		}
		
	}
	
	public int getNumber(){
		return numberInRoom;
	}
	
	public static int getTotal(){
		return totalNumber;
	}
}

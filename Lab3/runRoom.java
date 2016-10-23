
public class runRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalPeople;
		
		RoomOccupancy room1 = new RoomOccupancy();
		room1.addOneToRoom();
		room1.addOneToRoom();
		room1.addOneToRoom();
		room1.addOneToRoom();
		
		RoomOccupancy room2 = new RoomOccupancy();
		room2.addOneToRoom();
		room2.addOneToRoom();
		room2.removeOneFromRoom();
		room2.removeOneFromRoom();
		room2.removeOneFromRoom();
		room2.removeOneFromRoom();
		room2.addOneToRoom();
		
		totalPeople = RoomOccupancy.getTotal();
		
		System.out.println("Room 1 has: " + room1.getNumber() + " People");
		System.out.println("Room 2 has: " + room2.getNumber() + " People");
		System.out.println("Total number: " + totalPeople + " People");
	}

}


public class Lockers {

	static int maxLockers = 100;
	private boolean[] lockers = new boolean[maxLockers];
	int studentNo;
	
	public Lockers(){
		for(int i=0; i < maxLockers; i++){
			lockers[i] = false;
		}
		studentNo = 1;
	}
	
	public void studentsEnter(){
		for(int j=0; j<maxLockers;j++ ){
		
			for(int i=studentNo; i < (maxLockers + 1); i = i + studentNo){
				int lockerNo = (i - 1);
				if(lockers[lockerNo] == true){
					lockers[lockerNo] = false;
				}
				else if (lockers[lockerNo] == false){
					lockers[lockerNo] = true;
				}
			}
			studentNo++;
		}
	}
	
	public void checkLockerStatus(){
		for(int i=0; i < maxLockers; i++){
			if(lockers[i] == true){
				System.out.println("Locker " + (i + 1) + " is open.");
			}
		}
	}
}

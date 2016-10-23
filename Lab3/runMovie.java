
public class runMovie {

	public enum MPPA{
		EE, G, PG, PG13, R
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie movie1 = new Movie();
		movie1.setMovieName("Rio");
		MPPA mppa = MPPA.G;
		movie1.setMPPA(mppa);
		movie1.addRating(1);
		movie1.addRating(3);
		movie1.addRating(5);
		movie1.addRating(5);
		movie1.addRating(5);
		movie1.getAverage();
		
		Movie movie2 = new Movie();
		movie2.setMovieName("Iron Man 3");
		MPPA mppa2 = MPPA.PG13;
		movie2.setMPPA(mppa2);
		movie2.addRating(4);
		movie2.addRating(2);
		movie2.addRating(4);
		movie2.addRating(5);
		movie2.addRating(5);
		movie2.getAverage();
	}

}

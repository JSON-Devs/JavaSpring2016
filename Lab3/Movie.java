
public class Movie {
	private String movieName, mppaRating;
	private double avg, no1, no2, no3, no4, no5;
	private int noRatings1, noRatings2, noRatings3, noRatings4, noRatings5, totalRatings;
	
	public Movie(){
		movieName = "";
		mppaRating = "";
		noRatings1 = 0;
		noRatings2 = 0;
		noRatings3 = 0;
		noRatings4 = 0;
		noRatings5 = 0;
		totalRatings = 0;
		no1 = 0;
		no2 = 0;
		no3 = 0;
		no4 = 0;
		no5 = 0;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMPPA() {
		return mppaRating;
	}
	public void setMPPA (runMovie.MPPA mppa) {
		mppaRating = mppa.toString();
	}
	
	public void addRating(int rating){
		if(rating == 1){
			noRatings1++;
		}
		else if (rating == 2){
			noRatings2++;
		}
		else if (rating == 3){
			noRatings3++;
		}
		else if (rating == 4){
			noRatings4++;
		}
		else if (rating == 5){
			noRatings5++;
		}
		else{
			System.out.println("Invlaid Rating value");
		}	
		totalRatings++;
	}
	public void getAverage(){
		no1 = noRatings1 * 1;
		no2 = noRatings2 * 2;
		no3 = noRatings3 * 3;
		no4 = noRatings4 * 4;
		no5 = noRatings5 * 5;
		
		avg = ((no1 + no2 + no3 + no4 + no5)/totalRatings);
		
		System.out.println( movieName + ", Rated " + mppaRating + " - Average Rating: " + avg);
	}

}

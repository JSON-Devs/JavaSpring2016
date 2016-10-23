package jasongagnon.afinal;

import java.util.ArrayList;

public class Trips {
	private int MPG, daysInTrip, totalTripsAdded;
	private double gasPrice, totalMiles, hotelPricePerNight, totalCostOfGas, totalCostOfHotel, totalCostOfTrip, totalCostPerDay;
	private String tripDestination, tripList;
	ArrayList<String> placesArray = new ArrayList<String>(50);
	ArrayList<Double> costArray = new ArrayList<Double>(50);
	
	public Trips(){
		MPG = 0;
		daysInTrip = 0;
		totalMiles = 0;
		totalTripsAdded = 0;
		gasPrice = 0.00;
		totalMiles = 0.00;
		hotelPricePerNight = 0.00;
		totalCostOfGas = 0.00;
		totalCostOfHotel = 0.00;
		totalCostOfTrip = 0.00;
		totalCostPerDay = 0.00;
		tripDestination = "";
		tripList = "";
	}
	
	public double getTotalCostOfGas() {
		return totalCostOfGas;
	}

	public double getTotalCostOfHotel() {
		return totalCostOfHotel;
	}

	public double getTotalCostOfTrip() {
		return totalCostOfTrip;
	}

	public double getTotalCostPerDay() {
		return totalCostPerDay;
	}

	public String getTripList() {
		return tripList;
	}

	public void setMPG(int mPG) {
		MPG = mPG;
	}

	public void setDaysInTrip(int daysInTrip) {
		this.daysInTrip = daysInTrip;
	}

	public void setGasPrice(double gasPrice) {
		this.gasPrice = gasPrice;
	}

	public void setTotalMiles(double totalMiles) {
		this.totalMiles = totalMiles;
	}

	public void setHotelPricePerNight(double hotelPricePerNight) {
		this.hotelPricePerNight = hotelPricePerNight;
	}

	public void setTripDestination(String tripDestination) {
		this.tripDestination = tripDestination;
	}

	public void calcAll(){
		calcTotalCostOfGas();
		calcTotalCostOfHotel();
		calcTotalCostOfTrip();
		calcTotalCostPerDay();
	}
	
	public void calcTotalCostOfGas(){
		double gallonsForTrip;
		gallonsForTrip = totalMiles / MPG;
		totalCostOfGas = gallonsForTrip * gasPrice;
	}
	
	public void calcTotalCostPerDay(){
		totalCostPerDay = totalCostOfTrip / daysInTrip;
	}
	
	public void calcTotalCostOfHotel(){
		int nightsStaying = daysInTrip - 1;
		totalCostOfHotel = nightsStaying * hotelPricePerNight;
	}
	
	public void calcTotalCostOfTrip(){
		totalCostOfTrip = totalCostOfHotel + totalCostOfGas;
	}
	
	public void addTripToList(){
		placesArray.add(tripDestination);
		costArray.add(totalCostOfTrip);
		totalTripsAdded = totalTripsAdded + 1;
	}
	
	public String generateTripList(){
		for(int i = 0; i < totalTripsAdded; i++){
			if(i == 0){
				tripList +=placesArray.get(i) + ": " + costArray.get(i);
			}
			else {
				tripList += System.getProperty("line.separator") + placesArray.get(i) + ": " + costArray.get(i);
			}
		}
		return tripList;
	}
}

package com.sparkplug.flightBook;

public class BookAFlight implements BookAFlightInterface{
	String flightID;
	String luggage;
	String foodOrder;
	String seatType;
	
	@Override
	public String getFlightId() {
		// TODO Auto-generated method stub
		return flightID;
	}

	@Override
	public void setFlightId(String flightID) {
		// TODO Auto-generated method stub
		this.flightID=flightID;
	}

	@Override
	public String getLuggage() {
		// TODO Auto-generated method stub
		return luggage;
	}

	@Override
	public void setLuggage(String luggage) {
		// TODO Auto-generated method stub
		this.luggage=luggage;
	}

	@Override
	public String getSeatType() {
		// TODO Auto-generated method stub
		return seatType;
	}

	@Override
	public void setSeatType(String seatType) {
		// TODO Auto-generated method stub
		this.seatType=seatType;
	}

	@Override
	public String getFoodOrder() {
		// TODO Auto-generated method stub
		return foodOrder;
	}

	@Override
	public void setFoodOrder(String foodOrder) {
		// TODO Auto-generated method stub
		this.foodOrder=foodOrder;
	}

}

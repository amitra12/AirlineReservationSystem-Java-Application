package com.sparkplug.seat;

public class Seat implements SeatInterface{
	
	String seatID;
	String seatType;
	String seatState;
	@Override
	public String getSeatId() {
		// TODO Auto-generated method stub
		return seatID;
	}

	@Override
	public void setSeatId(String seatID) {
		// TODO Auto-generated method stub
		this.seatID =seatID;
	}

	@Override
	public String getSeatType() {
		// TODO Auto-generated method stub
		return seatType;
	}

	@Override
	public void setSeatType(String seatType) {
		// TODO Auto-generated method stub
		this.seatType =seatType;
	}

	@Override
	public String getSeatAvailability() {
		// TODO Auto-generated method stub
		return seatState;
	}

	@Override
	public void setSeatAvailability(String seatState) {
		// TODO Auto-generated method stub
		this.seatState =seatState;
	}
	
}

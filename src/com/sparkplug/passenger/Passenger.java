package com.sparkplug.passenger;

public class Passenger implements PassengerInterface{
	
	String name = null;
	String dob = null;
	String gender = null;
	int passengerID = 0;
	String passengerType = null;
	
	public int getPassengerId() {
		return passengerID;
	}

	public void setPassengerId(int passengerID) {
		this.passengerID = passengerID;
	}
	
	public String getPassengerType() {
		return passengerType;
	}

	public void setPassengerType(String type) {
		if(type.equals("1"))
			passengerType = "Passenger";
		else if (type.equals("2"))
			passengerType = "Admin";
		else
			passengerType = null;
	}
	
	public String getPassengerName() {
		return name;
	}

	public void setPassengerName(String name) {
		this.name = name;
	}
	
	public String getPassengerDob() {
		return dob;
	}

	public void setPassengerDob(String dob) {
		this.dob = dob;
	}
	public String getPassengerGender() {
		return gender;
	}

	public void setPassengerGender(String gender) {
		this.gender = gender;
	}
}

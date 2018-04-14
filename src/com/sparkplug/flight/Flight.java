package com.sparkplug.flight;

public class Flight implements FlightInterface {
	
	String FlightName = null;
	String FlightSource = null;
	String FlightDestination = null;
	String FlightID = null;
	String FlightType = null;
	
	@Override
	public String getFlightId() {
		// TODO Auto-generated method stub
		return FlightID;
	}

	@Override
	public void setFlightId(String FlightID) {
		// TODO Auto-generated method stub
		this.FlightID = FlightID;
		
	}

	@Override
	public String getFlightType() {
		// TODO Auto-generated method stub
		return FlightType;
	}

	@Override
	public void setFlightType(String FlightType) {
		// TODO Auto-generated method stub
		this.FlightType=FlightType;
		
	}

	@Override
	public String getFlightName() {
		// TODO Auto-generated method stub
		return FlightName;
	}

	@Override
	public void setFlightName(String FlightName) {
		// TODO Auto-generated method stub
		this.FlightName = FlightName;
		
	}

	@Override
	public String getFlightSource() {
		// TODO Auto-generated method stub
		return FlightSource;
	}

	@Override
	public void setFlightSource(String FlightSource) {
		// TODO Auto-generated method stub
		this.FlightSource = FlightSource;
		
	}

	@Override
	public String getFlightDestination() {
		// TODO Auto-generated method stub
		return FlightDestination;
	}

	@Override
	public void setFlightDestination(String FlightDestination) {
		// TODO Auto-generated method stub
		this.FlightDestination = FlightDestination;
		
	}

}

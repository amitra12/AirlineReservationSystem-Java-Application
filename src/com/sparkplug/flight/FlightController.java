package com.sparkplug.flight;

import java.util.ArrayList;
import java.util.Scanner;

import com.sparkplug.passenger.Passenger;
import com.sparkplug.passenger.PassengerController;

public class FlightController {
	
	static ArrayList<Flight> flightList = new ArrayList<Flight>();
	Flight objFlight1 = new Flight();
	Flight objFlight2 = new Flight();
	Flight objFlight3 = new Flight();
	
	public FlightController(){
		objFlight1.setFlightName("Emirates");
		objFlight1.setFlightId("EK101");
		objFlight1.setFlightType("Boeing777");
		objFlight1.setFlightSource("San Francisco");
		objFlight1.setFlightDestination("Boston");
		flightList.add(objFlight1);
	}
	//flightList.add(objFlight1);
	
	/*public static ArrayList<Flight> getFlightList() {
		return flightList;
	}
	public static void setMemberList(ArrayList<Flight> flightList) {
		FlightController.flightList = flightList;
	}*/
	
	public Flight getAllFlights() {
			
		Flight objFlight = new Flight(); 
	 		
	 		for(int i = 0; i < 1; i++)
	 		{
	 			objFlight = flightList.get(i);
				
				System.out.println("Flight Id: "+objFlight.getFlightId() + " Flight Name: "+objFlight.getFlightName() + " Flight Type: "+objFlight.getFlightType() + " Flight Source: "+objFlight.getFlightSource() + " Flight Destination: "+objFlight.getFlightDestination());
				//System.out.println("Flight Name: "+objFlight.getFlightName());
				//System.out.println("Flight Type: "+objFlight.getFlightType());
				//System.out.println("Flight Source: "+objFlight.getFlightSource());
				//System.out.println("Flight Destination: "+objFlight.getFlightDestination());
	 		}
	 		System.out.println();
	 		return objFlight;
		
				
		}
}

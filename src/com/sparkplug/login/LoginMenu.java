package com.sparkplug.login;

import java.util.Scanner;

import com.sparkplug.flight.FlightController;
import com.sparkplug.flightBook.BookAFlight;
import com.sparkplug.flightBook.BookAFlightController;
import com.sparkplug.passenger.Passenger;
import com.sparkplug.passenger.PassengerController;

public class LoginMenu {
	PassengerController pc = new PassengerController();

	public LoginMenu(){

		
	}
	public void Login(){
		Scanner scan;
		System.out.println("Enter User Id to Continue");
	      scan = new Scanner(System.in);
	      int passengerId= scan.nextInt();
	      //PassengerController pc = new PassengerController();
	      Passenger passengerObj = pc.getPassenger(passengerId);

	      if(passengerObj.getPassengerType().equals("Admin")){
	    	  System.out.println("Enter your Choice,  1. Get All Passengers Infomration | 0. Exit");
	    	  int UserInput = scan.nextInt();
	    	  if(UserInput == 1)
	    		  pc.getAllPassengers();
	      }
	      else if (passengerObj.getPassengerType().equals("Passenger")){
	    	  System.out.println("Enter your Choice,  1. Book a Flight | 2. Get Flight Details");
	    	  int UserInput = scan.nextInt();
	    	 if (UserInput == 1){
	    		 BookAFlightController obj =new BookAFlightController();
	    		 obj.flightDetails(passengerId);
	    	  }
	    	 else if (UserInput==2){
	    		 FlightController fc = new FlightController();
	    		 fc.getAllFlights();
	    	 }
	    		  
	      }
	}
}

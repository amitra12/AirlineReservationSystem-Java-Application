package com.sparkplug.flightBook;

import java.util.ArrayList;
import java.util.Scanner;

import com.sparkplug.flight.FlightController;
import com.sparkplug.foodOrder.FoodInformation;
import com.sparkplug.foodOrder.Italian;
import com.sparkplug.foodOrder.Meal;
import com.sparkplug.foodOrder.Non_Vegetarian;
import com.sparkplug.foodOrder.Vegetarian;
import com.sparkplug.passenger.Passenger;
import com.sparkplug.passenger.PassengerController;
import com.sparkplug.seat.Seat;
import com.sparkplug.seat.SeatController;
import com.sparkplug.singleton.Singleton;

public class BookAFlightController {
	Scanner scan = new Scanner(System.in);
	String flightID;
	String UserInput;
	String luggage;
	String foodOrder;
	String seatID;
	Meal meal;
	FoodInformation foodInformation = new FoodInformation();
	static ArrayList<BookAFlight> flightBookingList = new ArrayList<BookAFlight>();
	static ArrayList<Seat> seatList = new ArrayList<Seat>();
	BookAFlight obj = new BookAFlight();
	PassengerController pc = new PassengerController();
	Passenger passengerObj;
	
	public void flightDetails(int passengerId){
		passengerObj = pc.getPassenger(passengerId);
		
		//flight
		FlightController fc = new FlightController();
		fc.getAllFlights();
		System.out.println("Choose Flight ID");
		flightID = scan.nextLine();
		
		//Luggage
		System.out.println("Choose number of Bags: 0. No bags | 1. 1 Bag | 2. 2 Bags");
		String UserInput = scan.nextLine();
		if(UserInput.equals("0"))
			luggage = "No Bags";
		else if (UserInput.equals("1"))
			luggage = "1 Bag";
		else if (UserInput.equals("2"))
			luggage = "2 Bags";
		else
			luggage = "No Bags";
		
		//food
		System.out.println("Choose Meal Type from the options: 1.Vegetarian | 2. Non_Vegetarian | 3.Continental");
		String food = scan.next();

		if (food.equals("1")) {
			meal = new Vegetarian();
			foodOrder=foodInformation.getFoodInformation(meal);
		} else if (food.equals("2")) {

			meal = new Vegetarian();
			meal = new Non_Vegetarian(meal);
			foodOrder=foodInformation.getFoodInformation(meal);
		} else if (food.equals("3")) {
			meal = new Vegetarian();
			meal = new Italian(meal);
			foodOrder=foodInformation.getFoodInformation(meal);
		} else {
			System.out.println(" Option chosen is wrong");
		}
		
		//seat
		Singleton singleton = Singleton.getInstance();
		seatID=singleton.reserveSeat();
		
		//set all variables
		obj.setFlightId(flightID);
		obj.setLuggage(luggage);
		obj.setFoodOrder(foodOrder);
		obj.setSeatType(seatID);
		
		flightBookingList.add(obj);
		confirmation();
		
	}
	
	//create confirmation by displaying the arraylist
	public void confirmation(){
		System.out.println("Confirmation: Passenger Name: "+passengerObj.getPassengerName()+" FlightID: "+ obj.getFlightId()+ " " + " Luggage: "+ obj.getLuggage()+  " Food Order: " + obj.getFoodOrder()+ " Seatnumber: "+obj.getSeatType());
	}

}

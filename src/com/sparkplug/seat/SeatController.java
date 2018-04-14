package com.sparkplug.seat;

import java.util.ArrayList;

import com.sparkplug.flight.Flight;



public class SeatController {
	static ArrayList<Seat> seatList = new ArrayList<Seat>();
	Seat objSeat1 = new Seat();
	Seat objSeat2 = new Seat();
	Seat objSeat3 = new Seat();
	Seat objSeat4 = new Seat();
	Seat objSeat5 = new Seat();
	Seat objSeat6 = new Seat();
	Seat objSeat7 = new Seat();
	Seat objSeat8 = new Seat();
	Seat objSeat9 = new Seat();
	Seat objSeat = new Seat();
	
	public SeatController(){
		objSeat1.setSeatId("A1");
		objSeat1.setSeatType("Window");
		objSeat1.setSeatAvailability("Available");
		seatList.add(objSeat1);
		objSeat2.setSeatId("A2");
		objSeat2.setSeatType("Middle");
		objSeat2.setSeatAvailability("Available");
		seatList.add(objSeat2);
		objSeat3.setSeatId("A3");
		objSeat3.setSeatType("Aisle");
		objSeat3.setSeatAvailability("Available");
		seatList.add(objSeat3);
		
		objSeat4.setSeatId("B1");
		objSeat4.setSeatType("Window");
		objSeat4.setSeatAvailability("Available");
		seatList.add(objSeat4);
		objSeat5.setSeatId("B2");
		objSeat5.setSeatType("Middle");
		objSeat5.setSeatAvailability("Available");
		seatList.add(objSeat5);
		objSeat6.setSeatId("B3");
		objSeat6.setSeatType("Aisle");
		objSeat6.setSeatAvailability("Available");
		seatList.add(objSeat6);
		
		objSeat7.setSeatId("C1");
		objSeat7.setSeatType("Window");
		objSeat7.setSeatAvailability("Available");
		seatList.add(objSeat7);
		objSeat8.setSeatId("C2");
		objSeat8.setSeatType("Middle");
		objSeat8.setSeatAvailability("Available");
		seatList.add(objSeat8);
		objSeat9.setSeatId("C3");
		objSeat9.setSeatType("Aisle");
		objSeat9.setSeatAvailability("Available");
		seatList.add(objSeat9);
	}
	
	public Seat getAllSeats() {
	 		for(int i = 0; i < 9; i++)
	 		{
	 			objSeat = seatList.get(i);
				
				System.out.println("Seat Id: "+objSeat.getSeatId() +" Seat Type: "+objSeat.getSeatType() + "Seat Availability: "+objSeat.getSeatAvailability());
				//System.out.println("Seat Type: "+objSeat.getSeatType());
				//System.out.println("Seat Availability: "+objSeat.getSeatAvailability());
	 		}
	 		System.out.println();
	 		return objSeat;
		}
	public ArrayList<Seat> getSeatList(){
		return seatList;
	}
		
}

package com.sparkplug.singleton;

import java.util.ArrayList;
import java.util.Scanner;

import com.sparkplug.seat.Seat;
import com.sparkplug.seat.SeatController;

public class Singleton {
	private static Singleton instance;
	SeatController sc =new SeatController();
	static String seatID;
	Scanner scan = new Scanner(System.in);
	static ArrayList<Seat> seatList = new ArrayList<Seat>();
	Seat objSeat = new Seat();
	Boolean flag=false;
	
	private void Singleton(){
		
	}
	
	public static Singleton getInstance(){
		instance = new Singleton();
		return instance;
	} 
	
	public String reserveSeat(){
		while(true){
			System.out.println("Choose A Seat");
			sc.getAllSeats();
			System.out.println("Enter SeatID");
			//display list of windows seat
			seatID= scan.nextLine();
			seatList= sc.getSeatList();
			for(int i=0; i<seatList.size(); i++){
				objSeat = seatList.get(i);
				if(objSeat.getSeatId().equals(seatID)){

					if(objSeat.getSeatAvailability().equals("Available"))
					{
						objSeat.setSeatAvailability("Occupied");
						flag=true;
						break;
					}
					else{
						System.out.println("Seat is Occupied please choose another.");
						break;
					}
				}

			}
			if(flag==true)
				break;
			}
		return seatID;
	}
}

package com.sparkplug.login;
import java.util.Scanner;

import com.sparkplug.passenger.PassengerController;

public class Login {
	//Declare variables
	public static int UserInput = 0;
	private static Scanner scan;
	
	public static void main(String[] args) {
		
		do
		{
			UserInput = UserChoice();
	    	if(UserInput == 1)
	    	{
	    		LoginMenu menu = new LoginMenu();
	    		menu.Login();
	    		
	    	}
	    	else if(UserInput == 2)
	    	{
	    		PassengerController objPassenger = new PassengerController();
			    objPassenger.createPassenger();
	    	}
		}
		 while(1 != 0);
		
	}
	
	public static int UserChoice()
	{
		System.out.println("Welcome to Airline Reservation System");
		System.out.println("1. Login | 2. Register | 0. Exit");
	    scan = new Scanner(System.in);
	    int Input = scan.nextInt();
	    return Input;
	}
}

package com.sparkplug.passenger;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;


public class PassengerController {
	
	private static Scanner scan;
	static ArrayList<Passenger> passengerList = new ArrayList<Passenger>();
	Passenger objPassenger = new Passenger();
	Passenger objPassenger1 = new Passenger();
	Passenger objPassenger2 = new Passenger();
	
	public PassengerController(){
		/*objPassenger1.setPassengerName("Mohamad Khan");
	 	objPassenger1.setPassengerGender("Male");
	 	objPassenger1.setPassengerDob("05/19/1993");
	 	objPassenger1.setPassengerType("2");
	 	objPassenger1.setPassengerId(passengerList.size()+1);
	 	 	    
 	    passengerList.add(objPassenger1);
 	    
 	    objPassenger2.setPassengerName("Aparajita Mitra");
	 	objPassenger2.setPassengerGender("Female");
	 	objPassenger2.setPassengerDob("12/06/2000");
	 	objPassenger2.setPassengerType("1");
	 	objPassenger2.setPassengerId(passengerList.size()+1);
	 	 	    
	    passengerList.add(objPassenger2);*/
	}
	
	public static ArrayList<Passenger> getMemberList() {
		return passengerList;
	}
	public static void setMemberList(ArrayList<Passenger> passengerList) {
		PassengerController.passengerList = passengerList;
	}
	
	public void createPassenger()
	{
		String name;
		String dob;
		String gender;
		String type;
		
		System.out.println("Enter User Name");
	 	scan = new Scanner(System.in);
	 	name = scan.nextLine();
	 	
	 	 System.out.println("Enter Date of Birth");
		 scan = new Scanner(System.in);
		 dob = scan.nextLine();
		 
		 System.out.println("Enter Gender");
		 scan = new Scanner(System.in);
		 gender = scan.nextLine();
		 
		 System.out.println("Choose User type, 1. Passenger | 2. Admin");
		 scan = new Scanner(System.in);
		 type = scan.nextLine();
 	    		
    	objPassenger.setPassengerName(name);
	 	objPassenger.setPassengerGender(gender);
	 	objPassenger.setPassengerDob(dob);
	 	objPassenger.setPassengerId(passengerList.size()+1);
	 	objPassenger.setPassengerType(type);
 	    
 	    passengerList.add(objPassenger);
    	System.out.println("User Successfully Created: Your User Id is: "+ objPassenger.getPassengerId());
	}
	
	public Passenger getAllPassengers() {
		
		Passenger objPassenger = new Passenger(); 
 		
 		for(int i = 0; i < passengerList.size(); i++)
 		{
 			objPassenger = passengerList.get(i);
			
			System.out.println("Passenger Id: "+objPassenger.getPassengerId() + "Passenger Name: "+objPassenger.getPassengerName()+ "Passenger DOB: "+objPassenger.getPassengerDob()+ "Passenger Gender: "+objPassenger.getPassengerGender());
			//System.out.println("Passenger Name: "+objPassenger.getPassengerName());
			//System.out.println("Passenger DOB: "+objPassenger.getPassengerDob());
			//System.out.println("Passenger Gender: "+objPassenger.getPassengerGender());
 		}
 		return objPassenger;
	
			
	}
	
public Passenger getPassenger(int passengerId) {
		
	Passenger objPassenger = new Passenger(); 
 		
 		for(int i = 0; i < passengerList.size(); i++)
 		{
 			objPassenger = passengerList.get(i);

 		    if(objPassenger.getPassengerId()==passengerId){
 		       
 		    	//System.out.println("Passenger Id: "+objPassenger.getPassengerId() + " Passenger Name: "+objPassenger.getPassengerName() +" Passenger Type: "+objPassenger.getPassengerType());
 		    	//System.out.println("Passenger Name: "+objPassenger.getPassengerName());
 		    	//System.out.println("Passenger Type: "+objPassenger.getPassengerType());

 		    	return objPassenger;
 		    	 		        
 		    } 
 		    	
 		    
 		}
 		System.out.println(" Member Doesn't exist");
 		return null;
	
			
	}
public Passenger printPassenger(int passengerId) {
	
	Passenger objPassenger = new Passenger(); 
 		
 		for(int i = 0; i < passengerList.size(); i++)
 		{
 			objPassenger = passengerList.get(i);

 		    if(objPassenger.getPassengerId()==passengerId){
 		       
 		    	System.out.println("Passenger Id: "+objPassenger.getPassengerId() + " Passenger Name: "+objPassenger.getPassengerName() +" Passenger Type: "+objPassenger.getPassengerType());
 		    	//System.out.println("Passenger Name: "+objPassenger.getPassengerName());
 		    	//System.out.println("Passenger Type: "+objPassenger.getPassengerType());

 		    	return objPassenger;
 		    	 		        
 		    } 
 		    	
 		    
 		}
 		System.out.println(" Member Doesn't exist");
 		return null;
	
			
	}
}

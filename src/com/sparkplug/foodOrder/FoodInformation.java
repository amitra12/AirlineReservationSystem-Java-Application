package com.sparkplug.foodOrder;

public class FoodInformation {
	public static String getFoodInformation(Meal c) {
		//System.out.println(" The Meal chosen: " + c.getMealType());
		String foodOrder= c.getMealType();
		return foodOrder;
	}
}

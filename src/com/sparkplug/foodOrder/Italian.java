package com.sparkplug.foodOrder;

/**
 * Created by MeghShrey on 8/1/2017.
 */
public class Italian extends MealDecorator implements Meal {


    public Italian(Meal c) {
        super(c);
    }

    @Override
    public String getMealType() {
        return " Italian Burrito";
    }


}

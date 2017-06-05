/**
 *MealBuilder.java
 * Administrator
 *2017��6��5������5:33:48
 *
 */
package com.designpattern.a004BuilderPattern;

/**
 * @author ����ǿ
 * @Time  2017��6��5�� ����5:33:48
 */
public class MealBuilder {

	
	   public Meal prepareVegMeal (){
		      Meal meal = new Meal();
		      meal.addItem(new VegBurger());
		      meal.addItem(new Coke());
		      return meal;
		   }   

		   public Meal prepareNonVegMeal (){
		      Meal meal = new Meal();
		      meal.addItem(new ChickenBurger());
		      meal.addItem(new Pepsi());
		      return meal;
		   }
		   
}

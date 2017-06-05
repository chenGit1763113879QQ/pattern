/**
 *MealBuilder.java
 * Administrator
 *2017年6月5日下午5:33:48
 *
 */
package com.designpattern.a004BuilderPattern;

/**
 * @author 陈中强
 * @Time  2017年6月5日 下午5:33:48
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

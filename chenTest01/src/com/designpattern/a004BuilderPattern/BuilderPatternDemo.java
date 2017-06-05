/**
 *BuilderPatternDemo.java
 * Administrator
 *2017年6月5日下午5:34:39
 *
 */
package com.designpattern.a004BuilderPattern;

/**
 * @author 陈中强
 * @Time  2017年6月5日 下午5:34:39
 */
public class BuilderPatternDemo {

	
	   public static void main(String[] args) {
		      MealBuilder mealBuilder = new MealBuilder();

		      Meal vegMeal = mealBuilder.prepareVegMeal();
		      System.out.println("Veg Meal");
		      vegMeal.showItems();
		      System.out.println("Total Cost: " +vegMeal.getCost());

		      Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		      System.out.println("\n\nNon-Veg Meal");
		      nonVegMeal.showItems();
		      System.out.println("Total Cost: " +nonVegMeal.getCost());
		      
	   }      
}

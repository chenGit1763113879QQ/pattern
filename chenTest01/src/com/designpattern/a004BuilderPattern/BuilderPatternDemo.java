/**
 *BuilderPatternDemo.java
 * Administrator
 *2017��6��5������5:34:39
 *
 */
package com.designpattern.a004BuilderPattern;

/**
 * @author ����ǿ
 * @Time  2017��6��5�� ����5:34:39
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

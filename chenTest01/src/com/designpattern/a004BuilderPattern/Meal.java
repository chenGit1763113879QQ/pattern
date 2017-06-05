/**
 *Meal.java
 * Administrator
 *2017年6月5日下午5:32:42
 *
 */
package com.designpattern.a004BuilderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 陈中强
 * @Time  2017年6月5日 下午5:32:42
 */
public class Meal {

	
	 private List<Item> items = new ArrayList<Item>();	

	   public void addItem(Item item){
	      items.add(item);
	   }

	   public float getCost(){
	      float cost = 0.0f;
	      for (Item item : items) {
	         cost += item.price();
	      }		
	      return cost;
	   }

	   public void showItems(){
	      for (Item item : items) {
	         System.out.print("Item : "+item.name());
	         System.out.print(", Packing : "+item.packing().pack());
	         System.out.println(", Price : "+item.price());
	      }		
	   }	
	   
}

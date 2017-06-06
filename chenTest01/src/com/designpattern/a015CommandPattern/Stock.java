/**
 *Stock.java
 * Administrator
 *2017年6月6日下午3:04:26
 *
 */
package com.designpattern.a015CommandPattern;

/**
 * @author 陈中强
 * @Time  2017年6月6日 下午3:04:26
 */
public class Stock {

	 private String name = "ABC";
	 private int quantity = 10;
	 
	 
	
	   public void buy(){
		      System.out.println("Stock [ Name: "+ name +",Quantity: " + quantity +" ] bought");
		   }
	   
	   public void sell(){
		      System.out.println("Stock [ Name: "+ name +", Quantity: " + quantity +" ] sold");
		   }
	
}

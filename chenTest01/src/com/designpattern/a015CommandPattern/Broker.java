/**
 *Broker.java
 * Administrator
 *2017年6月6日下午3:09:47
 *
 */
package com.designpattern.a015CommandPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 陈中强
 * @Time  2017年6月6日 下午3:09:47
 */
public class Broker {

	
	   private List<Order> orderList = new ArrayList<Order>(); 
	   
	   public void takeOrder(Order order){
		      orderList.add(order);		
		   }
	   
	   public void placeOrders(){
		      for (Order order : orderList) {
		         order.execute();
		      }
		      orderList.clear();
		   }
	   
}

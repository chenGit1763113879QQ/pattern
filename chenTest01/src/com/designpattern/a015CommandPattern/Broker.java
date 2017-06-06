/**
 *Broker.java
 * Administrator
 *2017��6��6������3:09:47
 *
 */
package com.designpattern.a015CommandPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ����ǿ
 * @Time  2017��6��6�� ����3:09:47
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

/**
 *CommandPatternDemo.java
 * Administrator
 *2017��6��6������3:12:19
 *
 */
package com.designpattern.a015CommandPattern;

/**
 * @author ����ǿ
 * @Time  2017��6��6�� ����3:12:19
 */
public class CommandPatternDemo {

	/**
	 *  @param args
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��6�� ����3:12:19
	 */
	public static void main(String[] args) {
		
	
		Stock abcStock = new Stock();
		
		BuyStock buyStockOrder = new BuyStock(abcStock);
		SellStock sellStockOrder = new SellStock(abcStock);
		
	    Broker broker = new Broker();
	    broker.takeOrder(buyStockOrder);
	    broker.takeOrder(sellStockOrder);
	    
	    broker.placeOrders();
	      
		

	}

}

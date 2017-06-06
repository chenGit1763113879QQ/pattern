/**
 *CommandPatternDemo.java
 * Administrator
 *2017年6月6日下午3:12:19
 *
 */
package com.designpattern.a015CommandPattern;

/**
 * @author 陈中强
 * @Time  2017年6月6日 下午3:12:19
 */
public class CommandPatternDemo {

	/**
	 *  @param args
	 *  @author 陈中强-chen
	 *  @Time  2017年6月6日 下午3:12:19
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

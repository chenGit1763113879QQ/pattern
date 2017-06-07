/**
 *NullPatternDemo.java
 * Administrator
 *2017年6月7日上午9:37:56
 *
 */
package com.designpattern.a022NullObjectPattern;

/**
 * @author 陈中强
 * @Time  2017年6月7日 上午9:37:56
 */
public class NullPatternDemo {

	/**
	 *  @param args
	 *  @author 陈中强-chen
	 *  @Time  2017年6月7日 上午9:37:56
	 */
	public static void main(String[] args) {
		
		AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
		AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
		AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
		AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");

		
		System.out.println("Customers");
		System.out.println(customer1.getName());
		System.out.println(customer2.getName());
		System.out.println(customer3.getName());
		System.out.println(customer4.getName());
	}

}

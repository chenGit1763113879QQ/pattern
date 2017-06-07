/**
 *NullPatternDemo.java
 * Administrator
 *2017��6��7������9:37:56
 *
 */
package com.designpattern.a022NullObjectPattern;

/**
 * @author ����ǿ
 * @Time  2017��6��7�� ����9:37:56
 */
public class NullPatternDemo {

	/**
	 *  @param args
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��7�� ����9:37:56
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

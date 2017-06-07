/**
 *BusinessDelegatePatternDemo.java
 * Administrator
 *2017��6��7������3:24:14
 *
 */
package com.designpattern.a027BusinessDelegatePattern;

/**
 * @author ����ǿ
 * @Time  2017��6��7�� ����3:24:14
 */
public class BusinessDelegatePatternDemo {

	/**
	 *  @param args
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��7�� ����3:24:14
	 */
	public static void main(String[] args) {

		BusinessDelegate businessdelegate = new BusinessDelegate();
		businessdelegate.setServiceType("EJB");
		
		
		Client client = new Client(businessdelegate);
		client.doTask();
		
		businessdelegate.setServiceType("JMS");
	    client.doTask();
		
	}

}

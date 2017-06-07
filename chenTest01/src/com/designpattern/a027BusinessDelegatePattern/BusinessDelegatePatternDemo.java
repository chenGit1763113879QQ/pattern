/**
 *BusinessDelegatePatternDemo.java
 * Administrator
 *2017年6月7日下午3:24:14
 *
 */
package com.designpattern.a027BusinessDelegatePattern;

/**
 * @author 陈中强
 * @Time  2017年6月7日 下午3:24:14
 */
public class BusinessDelegatePatternDemo {

	/**
	 *  @param args
	 *  @author 陈中强-chen
	 *  @Time  2017年6月7日 下午3:24:14
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

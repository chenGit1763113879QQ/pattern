/**
 *CompositeEntityPatternDemo.java
 * Administrator
 *2017��6��7������3:56:51
 *
 */
package com.designpattern.a028CompositeEntityPattern;

/**
 * @author ����ǿ
 * @Time  2017��6��7�� ����3:56:51
 */
public class CompositeEntityPatternDemo {

	/**
	 *  @param args
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��7�� ����3:56:51
	 */
	public static void main(String[] args) {
		
		Client client = new Client();
		
		client.setData("data1", "data2");
		
		client.printData();
		
       client.setData("Second Test", "Data1");
       client.printData();

	}

}

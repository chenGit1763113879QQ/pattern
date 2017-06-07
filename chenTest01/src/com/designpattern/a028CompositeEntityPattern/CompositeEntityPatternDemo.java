/**
 *CompositeEntityPatternDemo.java
 * Administrator
 *2017年6月7日下午3:56:51
 *
 */
package com.designpattern.a028CompositeEntityPattern;

/**
 * @author 陈中强
 * @Time  2017年6月7日 下午3:56:51
 */
public class CompositeEntityPatternDemo {

	/**
	 *  @param args
	 *  @author 陈中强-chen
	 *  @Time  2017年6月7日 下午3:56:51
	 */
	public static void main(String[] args) {
		
		Client client = new Client();
		
		client.setData("data1", "data2");
		
		client.printData();
		
       client.setData("Second Test", "Data1");
       client.printData();

	}

}

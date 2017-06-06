/**
 *ObserverPatternDemo.java
 * Administrator
 *2017年6月6日下午5:01:31
 *
 */
package com.designpattern.a020ObserverPattern;

/**
 * @author 陈中强
 * @Time  2017年6月6日 下午5:01:31
 */
public class ObserverPatternDemo {

	/**
	 *  @param args
	 *  @author 陈中强-chen
	 *  @Time  2017年6月6日 下午5:01:31
	 */
	public static void main(String[] args) {

		 Subject subject = new Subject();
		 
	      new HexaObserver(subject);
	      new OctalObserver(subject);
	      new BinaryObserver(subject);
	      
	      System.out.println("First state change: 15");	
	      subject.setState(15);
	      System.out.println("Second state change: 10");	
	      subject.setState(10);
	      
	}

}

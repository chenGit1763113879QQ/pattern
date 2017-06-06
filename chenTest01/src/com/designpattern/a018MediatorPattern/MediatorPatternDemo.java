/**
 *MediatorPatternDemo.java
 * Administrator
 *2017年6月6日下午4:22:05
 *
 */
package com.designpattern.a018MediatorPattern;

/**
 * @author 陈中强
 * @Time  2017年6月6日 下午4:22:05
 */
public class MediatorPatternDemo {

	/**
	 *  @param args
	 *  @author 陈中强-chen
	 *  @Time  2017年6月6日 下午4:22:05
	 */
	public static void main(String[] args) {
		
		  User robert = new User("Robert");
	      User john = new User("John");

	      robert.sendMessage("Hi! John!");
	      john.sendMessage("Hello! Robert!");
	}

}

/**
 *MediatorPatternDemo.java
 * Administrator
 *2017��6��6������4:22:05
 *
 */
package com.designpattern.a018MediatorPattern;

/**
 * @author ����ǿ
 * @Time  2017��6��6�� ����4:22:05
 */
public class MediatorPatternDemo {

	/**
	 *  @param args
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��6�� ����4:22:05
	 */
	public static void main(String[] args) {
		
		  User robert = new User("Robert");
	      User john = new User("John");

	      robert.sendMessage("Hi! John!");
	      john.sendMessage("Hello! Robert!");
	}

}

/**
 *VisitorPatternDemo.java
 * Administrator
 *2017��6��7������2:38:15
 *
 */
package com.designpattern.a025VistitorPattern;

/**
 * @author ����ǿ
 * @Time  2017��6��7�� ����2:38:15
 */
public class VisitorPatternDemo {

	/**
	 *  @param args
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��7�� ����2:38:15
	 */
	public static void main(String[] args) {
		
		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());

	}

}

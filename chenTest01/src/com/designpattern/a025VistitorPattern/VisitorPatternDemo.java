/**
 *VisitorPatternDemo.java
 * Administrator
 *2017年6月7日下午2:38:15
 *
 */
package com.designpattern.a025VistitorPattern;

/**
 * @author 陈中强
 * @Time  2017年6月7日 下午2:38:15
 */
public class VisitorPatternDemo {

	/**
	 *  @param args
	 *  @author 陈中强-chen
	 *  @Time  2017年6月7日 下午2:38:15
	 */
	public static void main(String[] args) {
		
		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());

	}

}

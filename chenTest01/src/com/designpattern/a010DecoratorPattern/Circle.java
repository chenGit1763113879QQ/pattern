/**
 *Rectangle.java
 * Administrator
 *2017��6��6������11:48:26
 *
 */
package com.designpattern.a010DecoratorPattern;

/**
 * @author ����ǿ
 * @Time  2017��6��6�� ����11:48:26
 */
public class Circle implements Shape {

	/**
	 *  
	 * (non-Javadoc)
	 * @see com.designpattern.a010DecoratorPattern.Shape#draw()
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��6�� ����11:48:26
	 */
	@Override
	public void draw() {
		System.out.println("Shape: Circle");

	}

}

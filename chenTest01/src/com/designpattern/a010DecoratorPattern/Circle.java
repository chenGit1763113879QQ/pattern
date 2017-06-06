/**
 *Rectangle.java
 * Administrator
 *2017年6月6日上午11:48:26
 *
 */
package com.designpattern.a010DecoratorPattern;

/**
 * @author 陈中强
 * @Time  2017年6月6日 上午11:48:26
 */
public class Circle implements Shape {

	/**
	 *  
	 * (non-Javadoc)
	 * @see com.designpattern.a010DecoratorPattern.Shape#draw()
	 *  @author 陈中强-chen
	 *  @Time  2017年6月6日 上午11:48:26
	 */
	@Override
	public void draw() {
		System.out.println("Shape: Circle");

	}

}

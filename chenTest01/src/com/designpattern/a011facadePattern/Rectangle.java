/**
 *Rectangle.java
 * Administrator
 *2017年6月6日下午1:56:39
 *
 */
package com.designpattern.a011facadePattern;

/**
 * @author 陈中强
 * @Time  2017年6月6日 下午1:56:39
 */
public class Rectangle implements Shape {

	/**
	 *  
	 * (non-Javadoc)
	 * @see com.designpattern.a011facadePattern.Shape#draw()
	 *  @author 陈中强-chen
	 *  @Time  2017年6月6日 下午1:56:39
	 */
	@Override
	public void draw() {
		System.out.println("Rectangle::draw()");

	}

}

/**
 *Rectangle.java
 * Administrator
 *2017年6月5日上午10:58:39
 *
 */
package com.designpattern.a001FactoryPattern.impl;

import com.designpattern.a001FactoryPattern.Shape;

/**
 * @author 陈中强
 * @Time  2017年6月5日 上午10:58:39
 */
public class Rectangle implements Shape {

	/**
	 *  
	 * (non-Javadoc)
	 * @see com.designpattern.a001FactoryPattern.Shape#draw()
	 *  @author 陈中强-chen
	 *  @Time  2017年6月5日 上午10:58:39
	 */
	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");

	}

}

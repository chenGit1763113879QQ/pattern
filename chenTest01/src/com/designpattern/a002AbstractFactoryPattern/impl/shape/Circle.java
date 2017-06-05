/**
 *Circle.java
 * Administrator
 *2017年6月5日上午11:00:12
 *
 */
package com.designpattern.a002AbstractFactoryPattern.impl.shape;

import com.designpattern.a002AbstractFactoryPattern.Shape;


/**
 * @author 陈中强
 * @Time  2017年6月5日 上午11:00:12
 */
public class Circle implements Shape {

	/**
	 *  
	 * (non-Javadoc)
	 * @see com.designpattern.a001FactoryPattern.Shape#draw()
	 *  @author 陈中强-chen
	 *  @Time  2017年6月5日 上午11:00:13
	 */
	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");

	}

}

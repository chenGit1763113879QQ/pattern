/**
 *Circle.java
 * Administrator
 *2017��6��5������11:00:12
 *
 */
package com.designpattern.a002AbstractFactoryPattern.impl.shape;

import com.designpattern.a002AbstractFactoryPattern.Shape;


/**
 * @author ����ǿ
 * @Time  2017��6��5�� ����11:00:12
 */
public class Circle implements Shape {

	/**
	 *  
	 * (non-Javadoc)
	 * @see com.designpattern.a001FactoryPattern.Shape#draw()
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��5�� ����11:00:13
	 */
	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");

	}

}

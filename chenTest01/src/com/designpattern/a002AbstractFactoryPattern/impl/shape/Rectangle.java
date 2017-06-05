/**
 *Rectangle.java
 * Administrator
 *2017��6��5������10:58:39
 *
 */
package com.designpattern.a002AbstractFactoryPattern.impl.shape;

import com.designpattern.a002AbstractFactoryPattern.Shape;


/**
 * @author ����ǿ
 * @Time  2017��6��5�� ����10:58:39
 */
public class Rectangle implements Shape {

	/**
	 *  
	 * (non-Javadoc)
	 * @see com.designpattern.a001FactoryPattern.Shape#draw()
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��5�� ����10:58:39
	 */
	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");

	}

}

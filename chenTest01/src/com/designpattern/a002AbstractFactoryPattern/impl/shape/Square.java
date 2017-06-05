/**
 *Square.java
 * Administrator
 *2017年6月5日上午10:59:45
 *
 */
package com.designpattern.a002AbstractFactoryPattern.impl.shape;

import com.designpattern.a002AbstractFactoryPattern.Shape;


/**
 * @author 陈中强
 * @Time  2017年6月5日 上午10:59:45
 */
public class Square implements Shape {

	/**
	 *  
	 * (non-Javadoc)
	 * @see com.designpattern.a001FactoryPattern.Shape#draw()
	 *  @author 陈中强-chen
	 *  @Time  2017年6月5日 上午10:59:45
	 */
	@Override
	public void draw() {
		 System.out.println("Inside Square::draw() method.");

	}

}

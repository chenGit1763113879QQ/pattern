/**
 *Rectangle.java
 * Administrator
 *2017年6月5日下午6:01:57
 *
 */
package com.designpattern.a005PrototypePattern;

/**
 * @author 陈中强
 * @Time  2017年6月5日 下午6:01:57
 */
public class Circle extends Shape {

	
	/**
	 *  
	 * (non-Javadoc)
	 *  @author 陈中强-chen
	 *  @Time  2017年6月5日 下午6:02:41
	*/
	public Circle() {
		 type = "Circle";
	}

	/**
	 *  
	 * (non-Javadoc)
	 * @see com.designpattern.a005PrototypePattern.Shape#draw()
	 *  @author 陈中强-chen
	 *  @Time  2017年6月5日 下午6:01:57
	 */
	@Override
	void draw() {
		System.out.println("Inside Circle::draw() method.");
	}

}

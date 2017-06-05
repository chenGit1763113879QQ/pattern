/**
 *Rectangle.java
 * Administrator
 *2017��6��5������6:01:57
 *
 */
package com.designpattern.a005PrototypePattern;

/**
 * @author ����ǿ
 * @Time  2017��6��5�� ����6:01:57
 */
public class Circle extends Shape {

	
	/**
	 *  
	 * (non-Javadoc)
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��5�� ����6:02:41
	*/
	public Circle() {
		 type = "Circle";
	}

	/**
	 *  
	 * (non-Javadoc)
	 * @see com.designpattern.a005PrototypePattern.Shape#draw()
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��5�� ����6:01:57
	 */
	@Override
	void draw() {
		System.out.println("Inside Circle::draw() method.");
	}

}

/**
 *FacadePatternDemo.java
 * Administrator
 *2017��6��6������1:59:59
 *
 */
package com.designpattern.a011facadePattern;

/**
 * @author ����ǿ
 * @Time  2017��6��6�� ����1:59:59
 */
public class FacadePatternDemo {

	/**
	 *  @param args
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��6�� ����1:59:59
	 */
	public static void main(String[] args) {
	      ShapeMaker shapeMaker = new ShapeMaker();

	      shapeMaker.drawCircle();
	      shapeMaker.drawRectangle();
	      shapeMaker.drawSquare();		

	}

}

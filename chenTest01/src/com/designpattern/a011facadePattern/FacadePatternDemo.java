/**
 *FacadePatternDemo.java
 * Administrator
 *2017年6月6日下午1:59:59
 *
 */
package com.designpattern.a011facadePattern;

/**
 * @author 陈中强
 * @Time  2017年6月6日 下午1:59:59
 */
public class FacadePatternDemo {

	/**
	 *  @param args
	 *  @author 陈中强-chen
	 *  @Time  2017年6月6日 下午1:59:59
	 */
	public static void main(String[] args) {
	      ShapeMaker shapeMaker = new ShapeMaker();

	      shapeMaker.drawCircle();
	      shapeMaker.drawRectangle();
	      shapeMaker.drawSquare();		

	}

}

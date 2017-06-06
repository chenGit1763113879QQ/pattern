/**
 *DecoratorPatternDemo.java
 * Administrator
 *2017年6月6日上午11:54:11
 *
 */
package com.designpattern.a010DecoratorPattern;

/**
 * @author 陈中强
 * @Time  2017年6月6日 上午11:54:11
 */
public class DecoratorPatternDemo {

	/**
	 *  @param args
	 *  @author 陈中强-chen
	 *  @Time  2017年6月6日 上午11:54:11
	 */
	public static void main(String[] args) {
		
		

	      Shape circle = new Circle();

	      Shape redCircle = new RedShapeDecorator(new Circle());
	      
	      Shape redRectangle = new RedShapeDecorator(new Rectangle());
	     
	      System.out.println("Circle with normal border");
	      circle.draw();
	      
	      System.out.println("\nCircle of red border");
	      redCircle.draw();
	      
	      System.out.println("\nRectangle of red border");
	      redRectangle.draw();
	      
	      

	}

}

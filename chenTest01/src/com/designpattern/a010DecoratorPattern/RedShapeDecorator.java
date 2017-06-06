/**
 *RedShapeDecorator.java
 * Administrator
 *2017年6月6日上午11:52:18
 *
 */
package com.designpattern.a010DecoratorPattern;

/**
 * @author 陈中强
 * @Time  2017年6月6日 上午11:52:18
 */
public class RedShapeDecorator extends ShapeDecorator {

	/**
	 *  @param decoratedShape
	 * (non-Javadoc)
	 *  @author 陈中强-chen
	 *  @Time  2017年6月6日 上午11:52:23
	*/
	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}

	
	   @Override
	   public void draw() {
	      decoratedShape.draw();	       
	      setRedBorder(decoratedShape);
	   }


	/**
	 *  @param decoratedShape
	 *  @author 陈中强-chen
	 *  @Time  2017年6月6日 上午11:53:09
	*/
	private void setRedBorder(Shape decoratedShape) {
		  System.out.println("Border Color: Red");
		
	}
}

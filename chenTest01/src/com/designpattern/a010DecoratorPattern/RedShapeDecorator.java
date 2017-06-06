/**
 *RedShapeDecorator.java
 * Administrator
 *2017��6��6������11:52:18
 *
 */
package com.designpattern.a010DecoratorPattern;

/**
 * @author ����ǿ
 * @Time  2017��6��6�� ����11:52:18
 */
public class RedShapeDecorator extends ShapeDecorator {

	/**
	 *  @param decoratedShape
	 * (non-Javadoc)
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��6�� ����11:52:23
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
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��6�� ����11:53:09
	*/
	private void setRedBorder(Shape decoratedShape) {
		  System.out.println("Border Color: Red");
		
	}
}

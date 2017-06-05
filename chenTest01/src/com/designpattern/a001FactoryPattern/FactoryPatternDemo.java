/**
 *FactoryPatternDemo.java
 * Administrator
 *2017年6月5日上午11:02:13
 *
 */
package com.designpattern.a001FactoryPattern;

/**
 * @author 陈中强
 * @Time  2017年6月5日 上午11:02:13
 */
public class FactoryPatternDemo {

	/**
	 *  @param args
	 *  @author 陈中强-chen
	 *  @Time  2017年6月5日 上午11:02:13
	 */
	public static void main(String[] args) {
	      ShapeFactory shapeFactory = new ShapeFactory();

	      //获取 Circle 的对象，并调用它的 draw 方法
	      Shape shape1 = shapeFactory.getShape("CIRCLE");

	      //调用 Circle 的 draw 方法
	      shape1.draw();

	      //获取 Rectangle 的对象，并调用它的 draw 方法
	      Shape shape2 = shapeFactory.getShape("RECTANGLE");

	      //调用 Rectangle 的 draw 方法
	      shape2.draw();

	      //获取 Square 的对象，并调用它的 draw 方法
	      Shape shape3 = shapeFactory.getShape("SQUARE");

	      //调用 Square 的 draw 方法
	      shape3.draw();
	}

}

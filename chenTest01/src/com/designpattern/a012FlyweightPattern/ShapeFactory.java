/**
 *ShapeFactory.java
 * Administrator
 *2017年6月6日下午2:05:01
 *
 */
package com.designpattern.a012FlyweightPattern;

import java.util.HashMap;

/**
 * 
 * 创建一个工厂，生成基于给定信息的实体类的对象。
 * @author 陈中强
 * @Time  2017年6月6日 下午2:05:01
 */
public class ShapeFactory {

	
	 private static final HashMap<String, Shape> circleMap = new HashMap<String, Shape>();
	 
	   public static Shape getCircle(String color) {
		      Circle circle = (Circle)circleMap.get(color);

		      if(circle == null) {
		         circle = new Circle(color);
		         circleMap.put(color, circle);
		         System.out.println("Creating circle of color : " + color);
		      }
		      return circle;
		   }
}

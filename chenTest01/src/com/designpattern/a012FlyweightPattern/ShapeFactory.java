/**
 *ShapeFactory.java
 * Administrator
 *2017��6��6������2:05:01
 *
 */
package com.designpattern.a012FlyweightPattern;

import java.util.HashMap;

/**
 * 
 * ����һ�����������ɻ��ڸ�����Ϣ��ʵ����Ķ���
 * @author ����ǿ
 * @Time  2017��6��6�� ����2:05:01
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

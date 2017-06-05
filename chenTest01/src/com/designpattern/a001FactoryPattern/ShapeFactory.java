/**
 *ShapeFactory.java
 * Administrator
 *2017��6��5������11:00:48
 *
 */
package com.designpattern.a001FactoryPattern;

import com.designpattern.a001FactoryPattern.impl.Circle;
import com.designpattern.a001FactoryPattern.impl.Rectangle;
import com.designpattern.a001FactoryPattern.impl.Square;

/**
 * ����һ�����������ɻ��ڸ�����Ϣ��ʵ����Ķ���
 * @author ����ǿ
 * @Time  2017��6��5�� ����11:00:48
 */
public class ShapeFactory {

	   //ʹ�� getShape ������ȡ��״���͵Ķ���
	   public Shape getShape(String shapeType){
	      if(shapeType == null){
	         return null;
	      }		
	      if(shapeType.equalsIgnoreCase("CIRCLE")){
	         return new Circle();
	      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new Rectangle();
	      } else if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new Square();
	      }
	      return null;
	   }
	   
}

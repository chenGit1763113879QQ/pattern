/**
 *ShapeFactory.java
 * Administrator
 *2017��6��5������11:00:48
 *
 */
package com.designpattern.a002AbstractFactoryPattern;

import com.designpattern.a002AbstractFactoryPattern.impl.shape.Circle;
import com.designpattern.a002AbstractFactoryPattern.impl.shape.Rectangle;
import com.designpattern.a002AbstractFactoryPattern.impl.shape.Square;

/**
 * ����һ�����������ɻ��ڸ�����Ϣ��ʵ����Ķ���
 * @author ����ǿ
 * @Time  2017��6��5�� ����11:00:48
 */
public class ShapeFactory  extends AbstractFactory{

	   //ʹ�� getShape ������ȡ��״���͵Ķ���
	   @Override
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

	/**
	 *  @param color
	 *  @return
	 * (non-Javadoc)
	 * @see com.designpattern.a002AbstractFactoryPattern.AbstractFactory#getColor(java.lang.String)
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��5�� ����11:21:43
	*/
	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}
	   
}

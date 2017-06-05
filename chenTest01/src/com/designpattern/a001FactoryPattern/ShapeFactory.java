/**
 *ShapeFactory.java
 * Administrator
 *2017年6月5日上午11:00:48
 *
 */
package com.designpattern.a001FactoryPattern;

import com.designpattern.a001FactoryPattern.impl.Circle;
import com.designpattern.a001FactoryPattern.impl.Rectangle;
import com.designpattern.a001FactoryPattern.impl.Square;

/**
 * 创建一个工厂，生成基于给定信息的实体类的对象。
 * @author 陈中强
 * @Time  2017年6月5日 上午11:00:48
 */
public class ShapeFactory {

	   //使用 getShape 方法获取形状类型的对象
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

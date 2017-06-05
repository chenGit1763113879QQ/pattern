/**
 *FactoryProducer.java
 * Administrator
 *2017年6月5日上午11:24:32
 *
 */
package com.designpattern.a002AbstractFactoryPattern;

/**
 * 创建一个工厂创造器/生成器类，通过传递形状或颜色信息来获取工厂。
 * @author 陈中强
 * @Time  2017年6月5日 上午11:24:32
 */
public class FactoryProducer {

	   public static AbstractFactory getFactory(String choice){
		      if(choice.equalsIgnoreCase("SHAPE")){
		         return new ShapeFactory();
		      } else if(choice.equalsIgnoreCase("COLOR")){
		         return new ColorFactory();
		      }
		      return null;
		   }
	   
}

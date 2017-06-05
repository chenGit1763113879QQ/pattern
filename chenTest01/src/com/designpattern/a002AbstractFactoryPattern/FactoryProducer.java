/**
 *FactoryProducer.java
 * Administrator
 *2017��6��5������11:24:32
 *
 */
package com.designpattern.a002AbstractFactoryPattern;

/**
 * ����һ������������/�������࣬ͨ��������״����ɫ��Ϣ����ȡ������
 * @author ����ǿ
 * @Time  2017��6��5�� ����11:24:32
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

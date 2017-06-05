/**
 *AbstractFactory.java
 * Administrator
 *2017��6��5������11:20:49
 *
 */
package com.designpattern.a002AbstractFactoryPattern;

/**
 * @author ����ǿ
 * @Time  2017��6��5�� ����11:20:49
 */
public abstract class AbstractFactory {

	   abstract Color getColor(String color);
	   abstract Shape getShape(String shape) ;
	   
}

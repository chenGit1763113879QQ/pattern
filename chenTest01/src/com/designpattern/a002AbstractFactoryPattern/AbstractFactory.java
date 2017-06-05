/**
 *AbstractFactory.java
 * Administrator
 *2017年6月5日上午11:20:49
 *
 */
package com.designpattern.a002AbstractFactoryPattern;

/**
 * @author 陈中强
 * @Time  2017年6月5日 上午11:20:49
 */
public abstract class AbstractFactory {

	   abstract Color getColor(String color);
	   abstract Shape getShape(String shape) ;
	   
}

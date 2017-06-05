/**
 *blue.java
 * Administrator
 *2017年6月5日上午11:19:07
 *
 */
package com.designpattern.a002AbstractFactoryPattern.impl.color;

import com.designpattern.a002AbstractFactoryPattern.Color;

/**
 * @author 陈中强
 * @Time  2017年6月5日 上午11:19:07
 */
public class Blue implements Color {

	   @Override
	   public void fill() {
	      System.out.println("Inside Blue::fill() method.");
	   }
	}
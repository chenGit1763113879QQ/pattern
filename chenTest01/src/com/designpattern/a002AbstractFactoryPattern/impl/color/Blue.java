/**
 *blue.java
 * Administrator
 *2017��6��5������11:19:07
 *
 */
package com.designpattern.a002AbstractFactoryPattern.impl.color;

import com.designpattern.a002AbstractFactoryPattern.Color;

/**
 * @author ����ǿ
 * @Time  2017��6��5�� ����11:19:07
 */
public class Blue implements Color {

	   @Override
	   public void fill() {
	      System.out.println("Inside Blue::fill() method.");
	   }
	}
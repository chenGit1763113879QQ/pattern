/**
 *red.java
 * Administrator
 *2017��6��5������11:18:57
 *
 */
package com.designpattern.a002AbstractFactoryPattern.impl.color;

import com.designpattern.a002AbstractFactoryPattern.Color;

/**
 * @author ����ǿ
 * @Time  2017��6��5�� ����11:18:57
 */
public class Red implements Color {

	   @Override
	   public void fill() {
	      System.out.println("Inside Red::fill() method.");
	   }
	}

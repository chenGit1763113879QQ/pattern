/**
 *a.java
 * Administrator
 *2017��6��5������11:18:47
 *
 */
package com.designpattern.a002AbstractFactoryPattern.impl.color;

import com.designpattern.a002AbstractFactoryPattern.Color;

/**
 * @author ����ǿ
 * @Time  2017��6��5�� ����11:18:47
 */
public class Green implements Color {

	   @Override
	   public void fill() {
	      System.out.println("Inside Green::fill() method.");
	   }
	}
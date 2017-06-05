/**
 *a.java
 * Administrator
 *2017年6月5日上午11:18:47
 *
 */
package com.designpattern.a002AbstractFactoryPattern.impl.color;

import com.designpattern.a002AbstractFactoryPattern.Color;

/**
 * @author 陈中强
 * @Time  2017年6月5日 上午11:18:47
 */
public class Green implements Color {

	   @Override
	   public void fill() {
	      System.out.println("Inside Green::fill() method.");
	   }
	}
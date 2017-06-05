/**
 *Burger.java
 * Administrator
 *2017年6月5日下午5:23:29
 *
 */
package com.designpattern.a004BuilderPattern;

import com.designpattern.a004BuilderPattern.impl.Wrapper;

/**
 * @author 陈中强
 * @Time  2017年6月5日 下午5:23:29
 */
public abstract class Burger implements Item{

	   @Override
	   public Packing packing() {
	      return new Wrapper();
	   }

	   @Override
	   public abstract float price();
	   
}

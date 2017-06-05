/**
 *Burger.java
 * Administrator
 *2017��6��5������5:23:29
 *
 */
package com.designpattern.a004BuilderPattern;

import com.designpattern.a004BuilderPattern.impl.Wrapper;

/**
 * @author ����ǿ
 * @Time  2017��6��5�� ����5:23:29
 */
public abstract class Burger implements Item{

	   @Override
	   public Packing packing() {
	      return new Wrapper();
	   }

	   @Override
	   public abstract float price();
	   
}

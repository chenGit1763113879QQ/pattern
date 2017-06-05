/**
 *ColdDrink.java
 * Administrator
 *2017年6月5日下午5:24:26
 *
 */
package com.designpattern.a004BuilderPattern;

import com.designpattern.a004BuilderPattern.impl.Bottle;

/**
 * @author 陈中强
 * @Time  2017年6月5日 下午5:24:26
 */
public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
       return new Bottle();
	}

	@Override
	public abstract float price();

}

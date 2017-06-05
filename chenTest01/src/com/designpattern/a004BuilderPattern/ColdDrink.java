/**
 *ColdDrink.java
 * Administrator
 *2017��6��5������5:24:26
 *
 */
package com.designpattern.a004BuilderPattern;

import com.designpattern.a004BuilderPattern.impl.Bottle;

/**
 * @author ����ǿ
 * @Time  2017��6��5�� ����5:24:26
 */
public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
       return new Bottle();
	}

	@Override
	public abstract float price();

}
